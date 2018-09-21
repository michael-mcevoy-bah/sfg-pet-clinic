package guru.springframework.sfgpetclinic.model;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
public class PetType extends BaseEntity {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
