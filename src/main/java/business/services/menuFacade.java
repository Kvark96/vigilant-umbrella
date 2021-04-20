package business.services;

import business.entities.Bottom;
import business.entities.Topping;
import business.exceptions.UserException;
import business.persistence.Database;
import business.persistence.MenuMapper;
import java.util.HashMap;

public class menuFacade {
    private MenuMapper menuMapper;

    public menuFacade(Database database) {
        this.menuMapper = new MenuMapper(database);
    }

    public HashMap<Integer,Topping> getAllToppings() throws UserException {
        return menuMapper.getAllToppings();
        //TODO add getAllToppings in MenuMapper
    }
    public HashMap<Integer,Bottom> getAllBottoms() throws UserException {
        return menuMapper.getAllBottoms();
        //TODO add getAllBottoms in MenuMapper
    }
}
