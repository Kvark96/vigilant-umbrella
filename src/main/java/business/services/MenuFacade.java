package business.services;


import business.entities.Bottom;
import business.entities.Topping;
import business.persistence.Database;
import business.persistence.MenuMapper;

import java.util.List;

public class MenuFacade {

    private MenuMapper menuMapper;

    public MenuFacade(Database database) {
        this.menuMapper = menuMapper;
    }



    public List<Bottom> getBottomEntities() {
        return menuMapper.getBottomEntities();
    }

    public List<Topping> getToppingEntities() {
            return menuMapper.getToppingEntities();
        }
}