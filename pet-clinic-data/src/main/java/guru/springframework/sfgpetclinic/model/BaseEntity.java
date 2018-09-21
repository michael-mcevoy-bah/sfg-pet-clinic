package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
