package web.commands;

import business.entities.Order;
import business.persistence.OrderMapper;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class OrdreListeCommand extends CommandProtectedPage{
    public OrdreListeCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp){
        OrderMapper om = new OrderMapper(FrontController.database);
        List<Order> orders = om.getOrders();
        req.setAttribute("orders", orders);
        return pageToShow;
    }
}
