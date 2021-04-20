package web.commands;

import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrdreCommand extends CommandUnprotectedPage{


    public OrdreCommand(String pageToShow, String role) {
        super(pageToShow, role);

    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {
        return ;
    }
}
