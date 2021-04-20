package business.persistence;

import java.sql.*;


public class MenuMapper {


    private  Database database;



    public MenuMapper(Database database) {
        this.database = database;
    }


    public void getBottoms() throws SQLException {
        int product_id = 0;
        String name ="";
        Double price = 0.00;

        try(Connection connection = database.connect()) {

            String sql = "select * from cupcake.bottoms";


            try (PreparedStatement st = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setInt(1, product_id);
                st.setString(2, name);
                st.setDouble(3, price);
                st.executeUpdate();
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                System.out.println( rs);

            } catch (SQLException e) {
                throw new SQLException();
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        }


    public  void getTops(){

        int product_id = 0;
        String name ="";
        Double price = 0.00;

        try(Connection connection = database.connect()) {
            String sql = "select * from cupcake.toppings";


            try (PreparedStatement st = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                st.setInt(1, product_id);
                st.setString(2, name);
                st.setDouble(3, price);
                st.executeUpdate();
                ResultSet rs = st.getGeneratedKeys();
                rs.next();
                System.out.println( rs);

            } catch (SQLException e) {
                throw new SQLException();
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

}









