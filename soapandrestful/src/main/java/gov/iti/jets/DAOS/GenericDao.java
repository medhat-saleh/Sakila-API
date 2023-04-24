package gov.iti.jets.DAOS;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.DBResource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class GenericDao<T> implements ObjectDao<T> {
    private final Class<T> class1;
    private EntityManager entityManager = DBResource.getinstance();

    public GenericDao(Class<T> cruntclass) {
        this.class1 = cruntclass;
    }

    @Override
    public List<T> getAll(Class<T> entityClass) {
        try {
            entityManager.getTransaction().begin();
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> cq = cb.createQuery(entityClass);
            Root<T> rootEntry = cq.from(entityClass);
            CriteriaQuery<T> all = cq.select(rootEntry);
            TypedQuery<T> allQuery = entityManager.createQuery(all);
            entityManager.getTransaction().commit();
            return allQuery.getResultList();

        } catch (PersistenceException exception) {
            System.out.println(exception.getMessage());

        }
        return null;

    }

    @Override
    public boolean update(T entity) {
        try {
            entityManager.getTransaction().begin();
            if (entityManager.merge(entity) != null)
                entityManager.getTransaction().commit();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    @Override
    public boolean delete(int id) {
        try {
            entityManager.getTransaction().begin();

        T entity = findById(id);
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
            entityManager.getTransaction().commit();

            return true;
        }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

        return false;
    }

    @Override
    public T findById(int id) {
        try {

            return entityManager.find(class1, id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public T insert(T entity) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return entity;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return entity;
    }

   
}
