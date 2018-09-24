package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T t);

    void delete(T t);

    void deleteById(ID id);

}
