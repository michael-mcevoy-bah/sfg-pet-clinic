package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService {

}
