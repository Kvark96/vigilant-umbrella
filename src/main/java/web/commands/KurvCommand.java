package web.commands;

import business.entities.Bottom;
import business.entities.Cupcake;
import business.entities.Indkøbskurv;
import business.entities.Topping;
import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

public class KurvCommand extends CommandUnprotectedPage {
    public KurvCommand(String pageToShow) {
        super(pageToShow);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {
        HttpSession session = request.getSession();
        Cupcake cupcake;

        Indkøbskurv indkøbskurv = new Indkøbskurv();


        HashMap<Integer,Topping> toppingMap = (HashMap<Integer, Topping>) request.getServletContext().getAttribute("toppingMap");
        HashMap<Integer,Bottom> bottomMap = (HashMap<Integer, Bottom>) request.getServletContext().getAttribute("bottomMap");
        int toppingId = Integer.parseInt(request.getParameter("toppingid"));
        int bottomId = Integer.parseInt(request.getParameter("bottomid"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Topping topping = toppingMap.get(toppingId);
        Bottom bottom = bottomMap.get(bottomId);
        Double totalPrice = (topping.getPrice() + bottom.getPrice()) * quantity;

        if (session.getAttribute("tomordrepage") != null){
            indkøbskurv = (Indkøbskurv) session.getAttribute("tomordrepage") ;
        }

        cupcake = new Cupcake("Cupcake: "+topping.getName() + "/" + bottom.getName(), quantity, totalPrice,bottom,topping);

        indkøbskurv.addToProductMap(cupcake);

        session.setAttribute("tomordrepage", indkøbskurv);

        return pageToShow;


    }

}