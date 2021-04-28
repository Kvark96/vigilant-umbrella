package web.commands;

import business.entities.Cupcake;
import business.entities.Orderline;
import business.exceptions.UserException;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class SuccessCommand extends CommandProtectedPage{
    public SuccessCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    private void addToOrders(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        try (Connection connection = FrontController.database.connect()) {

            int id = (int) request.getSession().getAttribute("user_id");

            // Insert new order into system
            String insertSql = "INSERT INTO cupcake.orders (id) VALUES (?)";
            try (PreparedStatement ps = connection.prepareStatement(insertSql)) {
                ps.setInt(1, id);
                ps.execute();

            } catch (SQLException se) {
                System.out.println("Failed to add to orders = ");
                System.out.println(se.getMessage());
            }

            // Retrieve order_id and set in sessionScope
            String getIDSql = "SELECT order_id FROM cupcake.orders WHERE id = ?";
            try (PreparedStatement ps = connection.prepareStatement(getIDSql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                rs.next();
                request.getSession().setAttribute("new_order_id", rs.getInt("order_id"));
            } catch (SQLException se) {
                System.out.println("Failed to retrieve order_id from database = ");
                System.out.println(se.getMessage());
            }

        }
    }


        public void insertOrder (HttpServletRequest request, HttpServletResponse response) {

                try (Connection connection = database.connect()) {
                    String sql = "INSERT INTO orderline (top_id, bottom_id, quantity, order_id) VALUES (?,?,?,?)";

                    try (PreparedStatement ps = connection.prepareStatement(sql)) {
                        Orderline orderline = (Orderline) request.getSession().getAttribute("orderline");
                        orderline.getOrderline();

                        for (Cupcake c:orderline.getOrderline()) {
                            ps.setInt(1, c.getTopping().getProduct_id());
                            ps.setInt(2,c.getBottom().getProduct_id() );
                            ps.setInt(3,c.getQuantity());
                            ps.setInt(4, (Integer) request.getSession().getAttribute("new_order_id"));
                        }

                        ps.execute();

                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }



    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        addToOrders(request, response);
        insertOrder(request,response);

        Orderline orderline = (Orderline) request.getSession().getAttribute("orderline");
        orderline.empty();

        return pageToShow;
    }

}
