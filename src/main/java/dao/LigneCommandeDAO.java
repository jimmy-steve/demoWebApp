package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LigneCommandeDAO implements IItemDAO {
    static EntityManagerFactory entityManagerFactory =
            //---------------------------------------------le même nom que dans persistence.xml
            Persistence.createEntityManagerFactory("hibernate2");


    @Override
    public Boolean insert(Object objet) {
        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(objet);//---------------------------sauvegarde vers la bd
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return false;
        }
    }

    @Override
    public boolean update(int id, Object object) {
        return false;
    }
}
