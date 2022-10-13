package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CommandeDAO implements IItemDAO {
    static EntityManagerFactory entityManagerFactory =
            //---------------------------------------------le même nom que dans persistence.xml
            Persistence.createEntityManagerFactory("hibernate2");


    @Override
    public Boolean insert(Object objet) {
        return null;
    }

    @Override
    public boolean update(int id, Object object) {
        return false;
    }
}


