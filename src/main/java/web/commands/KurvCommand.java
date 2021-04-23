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

    public KurvCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();




        Indkoebskurv Indkoebskurv = new Indkoebskurv();
        // FLoat skal ændret til Dobule

      int bottom_id = Integer.parseInt(request.getParameter("bottoms"));
      int topping_id = Integer.parseInt(request.getParameter("Toppings"));
      int count = Integer.parseInt(request.getParameter("Count"));


       Orderline orderline = new Orderline();

        Cupcake cupcake = new Cupcake(count, bottom_id, topping_id);

        orderline.addCupcake(cupcake);




        Indkoebskurv indkoebskurv = new Indkoebskurv();


        if (session.getAttribute("tomordrepage") != null) {
            indkoebskurv = (Indkoebskurv) session.getAttribute("tomordrepage");
        }

        //cupcake = new Cupcake("Cupcake: "+topping.getName() + "/" + bottom.getName(), quantity, totalPrice,bottom,topping);

        // indkoebskurv.addToProductMap(cupcake);

        session.setAttribute("tomordrepage", indkoebskurv);


        return pageToShow;
    }

}