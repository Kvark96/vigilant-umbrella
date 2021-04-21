package web.commands;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcMenu extends CommandProtectedPage {


    public CalcMenu(String pageToShow, String role) {
        super(pageToShow, role);
    }


    public String getRole() {
        return role;
    }


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {



        String bottom = request.getParameter("bottom");
        String topping = request.getParameter("topping");
        int count = Integer.parseInt(request.getParameter("count"));



        return pageToShow;

    }

    /*
        request.setAttribute("bottom",bottom);
        request.setAttribute("toppings",topping);
        request.setAttribute("count",count);

*/



}


