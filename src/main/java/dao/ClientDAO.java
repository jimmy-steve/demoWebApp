package dao;

import modeles.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDAO implements IItemDAO{
    static EntityManagerFactory entityManagerFactory =
            //---------------------------------------------le même nom que dans persistence.xml
            Persistence.createEntityManagerFactory("hibernate2");



    @Override
    public Boolean insert(Object objet) {
        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try{
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(objet);//---------------------------sauvegarde vers la bd
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return false;
        }
    }

    public boolean update(int id, Object object) {
        Client client = null;
        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------
            /**
             * recherche une personne selon son id
             */
            client = entityManager.find(Client.class, id);

            client.setNomClient(((Client) object).getNomClient());//--------------------------- dans l'etat detached
            client.setNoTelephone(((Client) object).getNoTelephone());

            entityManager.persist(client);
            entityManager.getTransaction().commit();//dans L'etat de persistent
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return false;
        } finally {
            entityManager.close();//dans l'etat detached
        }
    }
}
