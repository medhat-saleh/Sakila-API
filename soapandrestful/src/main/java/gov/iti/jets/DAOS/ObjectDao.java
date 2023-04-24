package gov.iti.jets.DAOS;

import java.util.List;

public interface ObjectDao<T> {
  List<T> getAll(Class<T> entityClass);
    boolean update(T entity);
    boolean delete(int id);
    T findById(int id);
    T insert(T entity);
    
}
