package business.persistence;

import business.entities.Order;
import business.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    private Database database;

    public OrderMapper(Database database) {
        this.database = database;
    }

    public List<Order> getOrders(){
        List<Order> lst = new ArrayList<>();
        String sql = "SELECT email, order_id FROM orders JOIN users u on orders.id = u.id";
        try(Connection con = database.connect()){
            try(PreparedStatement ps = con.prepareStatement(sql)){
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    lst.add(new Order(rs.getInt("order_id"), rs.getString("email")));
                }

            } catch (SQLException s){
                System.out.println("PS Fail");
            }
        } catch (SQLException ex){
            System.out.println("Failed to collect orders from database");
            ex.printStackTrace();
        }
        return lst;
    }
}
