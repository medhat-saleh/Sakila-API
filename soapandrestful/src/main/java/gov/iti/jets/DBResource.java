package gov.iti.jets;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBResource {
    private DBResource(){};
    private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("sakila");
    private static EntityManager em=emf.createEntityManager();
    public static EntityManager getinstance(){
        return em;

}
public static void Close(){
    em.close();
}

}
