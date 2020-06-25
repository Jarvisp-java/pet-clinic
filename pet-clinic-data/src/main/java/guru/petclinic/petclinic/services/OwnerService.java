package guru.petclinic.petclinic.services;

import guru.petclinic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    @Override
    default Set<Owner> findAll() {
        return null;
    }
}
