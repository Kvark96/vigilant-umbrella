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

        MenuMapper MM = new MenuMapper(FrontController.database);
        List<Bottom> bottoms = MM.getBottomEntities();
        List<Topping> toppings = MM.getToppingEntities();
        request.setAttribute("bottoms", bottoms);
        request.setAttribute("Toppings",toppings);

return pageToShow;
    }

}
