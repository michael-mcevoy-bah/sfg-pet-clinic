package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    private Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T t) {
        if(t != null) {
            if (t.getId() == null) {
                t.setId(getNextId());
            }
        } else {
            throw new RuntimeException("cannot save null object");
        }
        map.put(t.getId(), t);
        return t;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Long getNextId() {
        if(map == null || map.isEmpty()) {
            return 1L;
        } else {
            return Collections.max(map.keySet()) + 1;
        }
    }
}
