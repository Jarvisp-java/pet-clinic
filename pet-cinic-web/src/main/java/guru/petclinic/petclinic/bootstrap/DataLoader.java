package guru.petclinic.petclinic.bootstrap;

import guru.petclinic.petclinic.model.Owner;
import guru.petclinic.petclinic.model.PetType;
import guru.petclinic.petclinic.model.Vet;
import guru.petclinic.petclinic.services.OwnerService;
import guru.petclinic.petclinic.services.PetTypeService;
import guru.petclinic.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstname("Michel");
        owner1.setLastname("Phelps");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Maria");
        owner2.setLastname("Paredes");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstname("Luis");
        owner3.setLastname("Toro");
        ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstname("Carlos");
        vet1.setLastname("Lopez");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Luisa");
        vet2.setLastname("Gonzales");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        System.out.println("Loaded Pet Types");

    }
}
