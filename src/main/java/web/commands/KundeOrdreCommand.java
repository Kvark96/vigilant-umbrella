package web.commands;

import business.entities.Order;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KundeOrdreCommand extends CommandProtectedPage {

    public KundeOrdreCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        List<Order> orders = new ArrayList<>();
        try (Connection con = FrontController.database.connect()) {

            String usermail = request.getParameter("email");
            request.setAttribute("titleName", usermail);
            String sql = "SELECT * FROM orders JOIN users u on orders.id = u.id WHERE u.email = '" + usermail + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                orders.add(new Order(rs.getInt("order_id"), request.getParameter("email")));

            }
            request.setAttribute("orders", orders);

        } catch (SQLException se) {
            System.out.println("Failed to connect to SQL in KundeOrdreCommand");
            se.printStackTrace();


        }
        return pageToShow;
    }
}