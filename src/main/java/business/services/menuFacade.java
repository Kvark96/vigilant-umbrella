package business.services;


import business.entities.Bottom;
import business.entities.Topping;
import business.persistence.Database;
import business.persistence.MenuMapper;

import java.util.List;

public class menuFacade {


    private MenuMapper menuMapper;

    public menuFacade(Database database) {
        this.menuMapper = menuMapper;
    }


/*
    public List<Bottom> getBottoomnEntities(){
        return menuMapper.getBottoomnEntities();

    }

    public List<Topping> getToppingEntities(){
        return menuMapper.getToppingEntities();

        Hvilken er rigtig?

    public HashMap<Integer,Topping> getAllToppings() throws UserException {
        //return menuMapper.getAllToppings();
        //TODO add getAllToppings in MenuMapper
        return new HashMap<>();
    }
    public HashMap<Integer,Bottom> getAllBottoms() throws UserException {
        //return menuMapper.getAllBottoms();
        //TODO add getAllBottoms in MenuMapper
        return new HashMap<>();

    }

 */
}
