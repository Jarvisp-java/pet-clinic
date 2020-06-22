package guru.petclinic.petclinic.services;

import guru.petclinic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
