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




    public String execute(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Cupcake cupcake;


        Indkoebskurv indkøbskurv = new Indkoebskurv();

        String Bottom_name = "";
        String Toppings_name = "";
        int count = 0;

        Indkoebskurv indkoebskurv = new Indkoebskurv();
        // FLoat skal ændret til Dobule



        request.setAttribute("Bottom", Bottom_name);
        request.setAttribute("Topping", Toppings_name);
        request.setAttribute("Count", count);



    public String execute(HttpServletRequest request, HttpServletResponse response) {
        //HttpSession session = request.getSession();


        int bottom_id = Integer.parseInt(request.getParameter("Bottom"));
        int topping_id = Integer.parseInt(request.getParameter("Toppings"));
        int count = Integer.parseInt(request.getParameter("Count"));




        Cupcake cupcake = new Cupcake(count, bottom_id, topping_id);

        orderline.addCupcake(cupcake);

        request.getSession().setAttribute("total_price", orderline.getCalcPrice());
        request.getSession().setAttribute("orderline", orderline);

/*
        Indkoebskurv indkoebskurv = new Indkoebskurv();


        if (session.getAttribute("tomordrepage") != null) {
            indkoebskurv = (Indkoebskurv) session.getAttribute("tomordrepage");
        }

        session.setAttribute("tomordrepage", indkoebskurv);
*/

        return pageToShow;
    }

}