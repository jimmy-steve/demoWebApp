package dao;

import modeles.Article;
import modeles.Client;
import modeles.Commande;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public interface IItemDAO<T> {
    static EntityManagerFactory entityManagerFactory =
            //---------------------------------------------le même nom que dans persistence.xml
            Persistence.createEntityManagerFactory("hibernate2");



    default List<Client> getAllClients(T object) {
        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try{
            entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();

            List<Client> clients = entityManager.createQuery("select i from Client i").getResultList();

            clients.get(clients.size() -1);

            entityManager.close();
            return clients;
        }catch (Exception e){
            e.printStackTrace();
            //entityManager.getTransaction().rollback();//----------------reviens en arrière
            return null;
        }finally {
            entityManager.close();

        }
    }

    default List<Article> getAllArticles(T object) {
        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try{
            entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();

            List<Article> articles = entityManager.createQuery("select i from Article i").getResultList();

            articles.get(articles.size() -1);

            entityManager.close();
            return articles;
        }catch (Exception e){
            e.printStackTrace();
            //entityManager.getTransaction().rollback();//----------------reviens en arrière
            return null;
        }
    }

    default List<Commande> select() {
        List<Commande> listeCommandes = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("select * from commande where no_client = 10 and no_commande > 3",
                            Commande.class);
            listeCommandes = query.getResultList();

            for (Commande tmp : listeCommandes
                 ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return listeCommandes;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return listeCommandes;
    }


    default List<Object> select2() {
        List<Object> liste = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("select c.no_client, c.nom_client, c.no_telephone, d.no_commande, d.date_commande from client " +
                                    "c JOIN commande d ON (c.no_client = d.no_client) where d.date_commande " +
                                    "= str_to_date('2/06/2000','%d/%m/%Y');",
                            Client.class);

            liste = query.getResultList();

            for (Object tmp : liste
            ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return liste;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return liste;
    }


    default List<Article> select3() {
        List<Article> liste = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("select no_article, description, prix_unitaire, quantite_en_stock from article " +
                                    "where description like upper('C%')",
                            Article.class);

            liste = query.getResultList();

            for (Article tmp : liste
            ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return liste;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return liste;
    }


    default List<Article> select4() {
        List<Article> liste = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("select * from article where prix_unitaire > (select avg(prix_unitaire) from article)",
                            Article.class);

            liste = query.getResultList();

            for (Article tmp : liste
            ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return liste;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return liste;
    }

    default List<Commande> select5() {
        List<Commande> listeCommandes = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("select c.no_commande,liv.no_livraison from commande c " +
                                    "JOIN lignecommande l ON (c.no_commande = l.no_commande)" +
                                    "JOIN detaillivraison d ON (l.no_commande = d.no_commande) " +
                                    "JOIN livraison liv ON (d.no_livraison = liv.no_livraison) " +
                                    "group by c.no_commande",
                            Commande.class);
            listeCommandes = query.getResultList();

            for (Commande tmp : listeCommandes
            ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return listeCommandes;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return listeCommandes;
    }


    default List<Client> select6() {
        List<Client> liste = null;

        EntityManager entityManager = null;
        /**
         * faire un try catch pour gerer les probleme lors de la transaction
         */
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();


            //-----------------------------------------------------------

            /**
             * la requête faire la requête
             */
            Query query = entityManager.createNativeQuery
                    ("SELECT * FROM Client C1 WHERE NOT EXISTS " +
                                    "(SELECT * FROM Commande C2 WHERE C1.no_client=C2.no_client)",
                            Client.class);

            liste = query.getResultList();

            for (Client tmp : liste
            ) {
                System.out.println(tmp);
            }
            //------------------------------------------------------------


        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();//----------------reviens en arrière
            return liste;
        } finally {
            entityManager.close();//dans l'etat detached
        }
        return liste;
    }

    Boolean insert(T objet);

    /**
     * Vas permetree de faire des update dans les table
     * @param id de l'objet
     * @param object l'bjet a modifier
     * @return true si la transaction est ok
     */
    boolean update(int id, T object);

}
