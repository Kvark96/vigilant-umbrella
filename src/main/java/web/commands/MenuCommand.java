package web.commands;

import business.entities.Bottom;
import business.entities.Topping;
import business.persistence.MenuMapper;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MenuCommand extends CommandProtectedPage {


    public MenuCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response){

        String Bottom = "";
        String Toppings = "";

        request.getParameter("Bottom");
        request.getParameter("Topping");


        request.setAttribute("Bottom", Bottom);
        request.setAttribute("Topping", Bottom);






return pageToShow;
    }

}
