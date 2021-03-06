package web.commands;

import business.exceptions.UserException;
import business.persistence.Database;

import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {
    //Return a token string from the execute method to make a client side redirect,
    // instead of a server side (forward) redirect
    public final static String REDIRECT_INDICATOR = "#*redirect*#_###_";
    public final static String WAS_NOT_FOUND_COMMAND = "404_NOT_FOUND";

    private static HashMap<String, Command> commands;
    public static Database database;

    private static void initCommands(Database database) {
        commands = new HashMap<>();
        commands.put("index", new CommandUnprotectedPage("index"));
        commands.put("loginpage", new CommandUnprotectedPage("loginpage"));
        commands.put("logincommand", new LoginCommand(""));
        commands.put("logoutcommand", new LogoutCommand(""));
        commands.put("registerpage", new CommandUnprotectedPage("registerpage"));
        commands.put("registercommand", new RegisterCommand(""));
        commands.put("customerpage", new CommandProtectedPage("customerpage", "customer"));
        commands.put("employeepage", new CommandProtectedPage("employeepage", "employee"));
        commands.put("kundeliste", new KundelisteCommand("kundeliste", "employee"));
        commands.put("ordreliste", new OrdreListeCommand("ordreliste", "employee"));
        commands.put("kundeordre", new KundeOrdreCommand("kundeordre", "employee"));
        commands.put("tomordrepage", new KurvCommand("tomordrepage", "customer"));
        commands.put("menu", new CommandProtectedPage("menu", "customer"));
        commands.put("frontorderpage", new CommandProtectedPage("tomordrepage", "customer"));
        commands.put("success", new SuccessCommand("success", "customer"));
        commands.put("paymentpage", new PaymentCommand("paymentpage","customer"));


    }

    public static Command fromPath(
            HttpServletRequest request,
            Database db) {
        String action = request.getPathInfo().replaceAll("^/+", "");
        System.out.println("--> " + action);

        if (commands == null) {
            database = db;
            initCommands(database);
        }

        return commands.getOrDefault(action, new CommandUnknown());   // unknowncommand is default
    }

    public abstract String execute(
            HttpServletRequest request,
            HttpServletResponse response)
            throws UserException, SQLException;

}
