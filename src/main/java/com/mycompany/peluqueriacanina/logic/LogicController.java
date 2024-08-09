package com.mycompany.peluqueriacanina.logic;

import com.mycompany.peluqueriacanina.persistence.PersistenceController;
import com.mycompany.peluqueriacanina.persistence.exceptions.NonexistentEntityException;
import java.util.List;

public class LogicController {
    
    PersistenceController persistenceController = new PersistenceController();

    public void saveData(String clientNumber, String clientName,
            String clientRace, String clientColor, String alergic, 
            String specialAtention, String ownerName, String ownerPhone, 
            String observation) {
        
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setPhone(ownerPhone);
        
        Pet pet = new Pet();
        pet.setClientNumber(clientNumber);
        pet.setPetName(clientName);
        pet.setRace(clientRace);
        pet.setColor(clientColor);
        pet.setAlergic(alergic);
        pet.setSpeacialAtention(specialAtention);
        pet.setObservation(observation);
        pet.setOwner(owner);
        
        persistenceController.saveData(owner, pet);
        
    }

    public List<Pet> getPetData() {
        return persistenceController.getPetData();
    }

    public void deletePet(int id) throws NonexistentEntityException {
        persistenceController.deletePet(id);
    }

    public Pet findPet(int id) {
        return persistenceController.findPet(id);
    }
    
    /*
    jTextFieldClientName.getText(),
                jTextFieldClientRace.getText(),
                jTextFieldClientColor.getText(),
                (String) jComboBoxAlergic.getSelectedItem(),
                (String) jComboBoxSpecialAtention.getSelectedItem(),
                jTextFieldOwnerName.getText(),
                jTextFieldOwnerPhone.getText(),
                jTextAreaObservations.getText()
    */

    public void editPet(
            Pet pet, String clientName, String clientRace, String clientColor, 
            String alergic, String specialAtention, String ownerName,
            String ownerPhone, String observations) {
        
        pet.setPetName(clientName);
        pet.setRace(clientRace);
        pet.setColor(clientColor);
        pet.setAlergic(alergic);
        pet.setSpeacialAtention(specialAtention);
        pet.setObservation(observations);
        
        persistenceController.editPet(pet);
        
        Owner owner = this.findOwner(pet.getOwner().getId());
        owner.setName(ownerName);
        owner.setPhone(ownerPhone);
        
        this.editOwner(owner);
            
    }

    private Owner findOwner(int id) {
        return persistenceController.findOwner(id);
    }

    private void editOwner(Owner owner) {
        persistenceController.editOwner(owner);
    }
    
    
}
