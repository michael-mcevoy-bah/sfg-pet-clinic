package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {

}
