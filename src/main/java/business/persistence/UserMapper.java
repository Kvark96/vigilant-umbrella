package business.persistence;

import business.entities.Orderline;
import business.exceptions.UserException;
import business.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserMapper {
    private Database database;

    public UserMapper(Database database) {
        this.database = database;
    }

    public void createUser(User user) throws UserException {
        try (Connection connection = database.connect()) {
            String sql = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";

            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, user.getEmail());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getRole());
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                int id = ids.getInt(1);
                user.setId(id);
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }
        } catch (SQLException ex) {
            throw new UserException(ex.getMessage());
        }
    }

    public User login(String email, String password) throws UserException {
        try (Connection connection = database.connect()) {
            String sql = "SELECT id, role, balance FROM users WHERE email=? AND password=?";

            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    String role = rs.getString("role");
                    int id = rs.getInt("id");
                    User user = new User(email, password, role);
                    user.setId(id);
                    return user;
                } else {
                    throw new UserException("Could not validate user");
                }
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }
        } catch (SQLException ex) {
            throw new UserException("Connection to database could not be established");
        }
    }

    public List<User> getUsers() {
        List<User> lst = new ArrayList<>();
        //ArrayList<User> lst = new ArrayList<>();
        try (Connection connection = database.connect()) {
            String SQL = "SELECT * FROM users WHERE role = 'customer'";
            try (PreparedStatement ps = connection.prepareStatement(SQL)) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    lst.add(new User(rs.getString("email"), rs.getString("password"), "customer"));
                }

            } catch (SQLException s) {
                System.out.println("PS Fail");
            }
        } catch (SQLException e) {
            System.out.println("Connection to database could not be established.");
        }
        return lst;
    }

    public double withdraw_from_balance (Double totalprice, int id) {
        // Get current balance and check whether totalprice can be subtracted
        Double currentBal = getBalance(id);
        if(currentBal == -1.0 || currentBal - totalprice < 0) return -1.0;

        Double newBal = -1.0;

        // Update balance to new balance
        try (Connection connection = database.connect()) {
            String SQL = "UPDATE cupcake.users SET balance = ? WHERE id = ?";
            try (PreparedStatement ps = connection.prepareStatement(SQL)) {
                ps.setInt(2,id);
                ps.setDouble(1,currentBal - totalprice);
                ResultSet rs = ps.executeQuery();
                newBal = rs.getDouble("balance");
            } catch (SQLException s) {
                System.out.println("PS Fail in withdraw");
            }
        } catch (SQLException e) {
            System.out.println("Connection to database could not be established.");
        }

        return newBal;
    }

    public double getBalance(int id) {

        Double balance = -1.00;
        try (Connection connection = database.connect()) {
            String SQL = "SELECT balance FROM cupcake.users where id = ?";

            try (PreparedStatement ps = connection.prepareStatement(SQL)) {
                ps.setInt(1,id);
                System.out.println("id = " + id);
                ResultSet rs = ps.executeQuery();
                balance = rs.getDouble(1);
                System.out.println("balance = " + balance);

            } catch (SQLException s) {
                System.out.println("PS Fail in get balance");
                System.out.println(s.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Connection to database could not be established.");
        }
        return balance;
    }

    }



