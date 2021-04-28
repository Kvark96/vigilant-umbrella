package web.commands;

import business.entities.*;
import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

public class KurvCommand extends CommandProtectedPage {
    Orderline orderline;
    public KurvCommand(String pageToShow, String role) {
        super(pageToShow, role);
        orderline = new Orderline();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("SESSION ATTRIBUTES = ");
        Enumeration<String> atts = request.getSession().getAttributeNames();
        System.out.println();

        while(atts.hasMoreElements()) {
            System.out.println(request.getSession().getAttribute(atts.nextElement()));
        }
        System.out.println();


        int bottom_id = Integer.parseInt(request.getParameter("Bottom"));
        int topping_id = Integer.parseInt(request.getParameter("Toppings"));
        int count = Integer.parseInt(request.getParameter("Count"));


        int id = (int) request.getSession().getAttribute("user_id");






        Cupcake cupcake = new Cupcake(count, bottom_id, topping_id);

        orderline.addCupcake(cupcake);

        request.getSession().setAttribute("id", id);
        request.getSession().setAttribute("total_price", orderline.getCalcPrice());
        request.getSession().setAttribute("orderline", orderline);


        return pageToShow;
    }

}