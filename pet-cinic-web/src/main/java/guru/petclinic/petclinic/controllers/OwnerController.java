package guru.petclinic.petclinic.controllers;

import guru.petclinic.petclinic.model.Owner;
import guru.petclinic.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping()
    public String listOwner(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

}
