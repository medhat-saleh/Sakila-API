package gov.iti.jets.DAOS;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.DBResource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class GenericDao<T> implements ObjectDao<T> {
    private final  Class<T> class1;
 private EntityManager entityManager=DBResource.getinstance();
 public GenericDao(Class<T> cruntclass){
    this.class1=cruntclass;
 }
    @Override
    public List<T> getAll(Class<T> entityClass) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> rootEntry = cq.from(entityClass);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();    
    }

    @Override
    public boolean update(T entity) {
       if ( entityManager.merge(entity)!=null )return true;
    return false;
    }

    @Override
    public boolean delete(int id) {
        T entity = findById(id);
        if(entityManager.contains(entity)){
        entityManager.remove(entity);
    return true;
    }

        return false;
    }

    @Override
    public T findById(int id) {
        System.out.println("/////////////////////////////////////////");
        return entityManager.find(class1 , id);   
     }

    @Override
    public T insert(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    // @Override
    // public boolean isExist(String propertyName, Object value) { 
    //     CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    //     CriteriaQuery<Long> cq = cb.createQuery(Long.class);
    //     Root<T> root = cq.from(class1);
    //     Predicate predicate = cb.equal(root.get(propertyName), value);
    //     cq.select(cb.count(root)).where(predicate);
    //     return entityManager.createQuery(cq).getSingleResult() > 0;    }

    @Override
    public List<T> findByName(String name, Class<T> entityClass) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> root = cq.from(entityClass);
        Predicate predicate = cb.equal(root.get(name), entityClass);
        cq.select(root).where(predicate);
        return entityManager.createQuery(cq).getResultList();    }

    
}
