package web.commands;

import business.exceptions.UserException;
import business.persistence.UserMapper;
import web.FrontController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaymentCommand extends CommandProtectedPage{
    public PaymentCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {



        return pageToShow;
    }
}
