package business.services;

import business.entities.BottomEntities;
import business.persistence.Database;
import business.persistence.MenuMapper;

import java.util.List;

public class menuFacade {


    private MenuMapper menuMapper;

    public menuFacade(Database database) {
        this.menuMapper = menuMapper;
    }


    public List<BottomEntities> getBottoomnEntities(){
        return menuMapper.getBottoomnEntities();

    }

    public List<BottomEntities> getToppingEntities(){
        return menuMapper.getBottoomnEntities();

    }
}
