package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/", "/owners/index", "/owners/index.html"})
    public String getOwners() {
        return "owners/index";
    }
}
