package web.commands;

import business.entities.User;
import business.persistence.UserMapper;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class KundelisteCommand extends CommandProtectedPage{
    public KundelisteCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp){



        UserMapper um = new UserMapper(FrontController.database);
        List<User> customers = um.getUsers();
        req.setAttribute("customers", customers);
        return pageToShow;
    }
}
