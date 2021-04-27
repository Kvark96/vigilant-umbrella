package web.commands;

import business.entities.*;
import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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


        int bottom_id = Integer.parseInt(request.getParameter("Bottom"));
        int topping_id = Integer.parseInt(request.getParameter("Toppings"));
        int count = Integer.parseInt(request.getParameter("Count"));
        String email = "";
        String password= "";
        String role = "";
        User user = new User(email,password,role);

        int id = user.getId();




        Cupcake cupcake = new Cupcake(count, bottom_id, topping_id);

        orderline.addCupcake(cupcake);

        request.getSession().setAttribute("id",id);
        request.getSession().setAttribute("total_price", orderline.getCalcPrice());
        request.getSession().setAttribute("orderline", orderline);


        return pageToShow;
    }

}