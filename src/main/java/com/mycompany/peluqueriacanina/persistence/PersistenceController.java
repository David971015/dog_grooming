package com.mycompany.peluqueriacanina.persistence;

import com.mycompany.peluqueriacanina.logic.Owner;
import com.mycompany.peluqueriacanina.logic.Pet;
import com.mycompany.peluqueriacanina.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    OwnerJpaController ownerJpaController = new OwnerJpaController();
    PetJpaController petJpaController = new PetJpaController();
    
    public void saveData(Owner owner, Pet pet){
        ownerJpaController.create(owner);
        petJpaController.create(pet);
    }

    public List<Pet> getPetData() {
        return petJpaController.findPetEntities();
    }

    public void deletePet(int id) throws NonexistentEntityException {
        petJpaController.destroy(id);
    }

    public Pet findPet(int id) {
        return petJpaController.findPet(id);
    }

    public void editPet(Pet pet) {
        try {
            petJpaController.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner findOwner(int id) {
        return ownerJpaController.findOwner(id);
    }

    public void editOwner(Owner owner) {
        try {
            ownerJpaController.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
