package web.commands;

import business.entities.Bottom;
import business.entities.Topping;
import business.persistence.MenuMapper;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class MenuCommand extends CommandProtectedPage {


    public MenuCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response){

        String Bottom_name = "";
        String Toppings_name = "";
        int count = 0;

        Bottom_name = request.getParameter("bottoms");
        Toppings_name = request.getParameter("Toppings");
        count = Integer.parseInt(request.getParameter("Count"));
        request.setAttribute("Bottom", Bottom_name);
        request.setAttribute("Topping", Toppings_name);
        request.setAttribute("Count", count);


return pageToShow;
    }

}
