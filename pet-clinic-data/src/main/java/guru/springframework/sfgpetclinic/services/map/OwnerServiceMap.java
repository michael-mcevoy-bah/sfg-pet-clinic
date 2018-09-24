package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
