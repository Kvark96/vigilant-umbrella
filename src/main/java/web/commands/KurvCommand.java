package web.commands;

import business.entities.Bottom;
import business.entities.Cupcake;
import business.entities.Indkoebskurv;
import business.entities.Topping;
import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

public class KurvCommand extends CommandProtectedPage{
    public KurvCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Cupcake cupcake;


        Indkøbskurv indkøbskurv = new Indkøbskurv();

        String Bottom_name = "";
        String Toppings_name = "";
        int count = 0;

        Indkoebskurv indkoebskurv = new Indkoebskurv();
        // FLoat skal ændret til Dobule



        request.setAttribute("Bottom", Bottom_name);
        request.setAttribute("Topping", Toppings_name);
        request.setAttribute("Count", count);








/*
        HashMap<Integer,Topping> toppingMap = (HashMap<Integer, Topping>) request.getServletContext().getAttribute("toppingMap");
        HashMap<Integer,Bottom> bottomMap = (HashMap<Integer, Bottom>) request.getServletContext().getAttribute("bottomMap");
        int toppingId = Integer.parseInt(request.getParameter("toppingid"));
        int bottomId = Integer.parseInt(request.getParameter("bottomid"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Topping topping = toppingMap.get(toppingId);
        Bottom bottom = bottomMap.get(bottomId);
        Double totalPrice = (topping.getPrice() + bottom.getPrice()) * quantity;

        if (session.getAttribute("tomordrepage") != null){
            indkoebskurv = (Indkoebskurv) session.getAttribute("tomordrepage") ;
        }

        cupcake = new Cupcake("Cupcake: "+topping.getName() + "/" + bottom.getName(), quantity, totalPrice,bottom,topping);

        indkoebskurv.addToProductMap(cupcake);

        session.setAttribute("tomordrepage", indkoebskurv);


 */

        return pageToShow;
    }

}