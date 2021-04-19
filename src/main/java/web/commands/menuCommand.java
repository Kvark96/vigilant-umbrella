package web.commands;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class menuCommand extends CommandProtectedPage {


    public menuCommand(String pageToShow, String role) {
        super(pageToShow, role);
    }


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return pageToShow;
    }

    int bottom = Integer.parseInt(request.getParameter("bottom"));
    int toppings = Integer.parseInt(request.getParameter("toppings"));
    int count = Integer.parseInt(request.getParameter("count"));



        request.setAttribute("bottom",bottom);
        request.setAttribute("toppings",toppings);
        request.setAttribute("count",count);


    public String getRole() {
        return role;
    }

}


