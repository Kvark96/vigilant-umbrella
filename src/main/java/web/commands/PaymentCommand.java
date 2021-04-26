package web.commands;

import business.entities.User;
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
        UserMapper UM = new UserMapper(FrontController.database);
        Double total_price = Double.parseDouble("total_price");
        int id = Integer.parseInt("id");
        Double currentBalance= UM.getBalance(id);

















        return pageToShow;
    }
}
