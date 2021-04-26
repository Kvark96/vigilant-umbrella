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
        
        Double total_price = (Double) request.getSession().getAttribute("total_price");
        int id = (int) request.getSession().getAttribute("id");


        request.setAttribute("current_balance", UM.getBalance(id));
        request.setAttribute("new_balance", UM.withdraw_from_balance(total_price, id));


        return pageToShow;
    }
}
