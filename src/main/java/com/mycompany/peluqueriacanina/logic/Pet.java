package com.mycompany.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mascota")
public class Pet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "número_mascota")
    private String clientNumber;
    @Column(name = "nombre")
    private String petName;
    @Column(name = "raza")
    private String race;
    @Column(name = "color")
    private String color;
    @Column(name = "alérgico")
    private String alergic;
    @Column(name = "atención_especial")
    private String speacialAtention;
    @Column(name = "observaciones")
    private String observation;
    
    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String clientNumber, String petName, String race, String color,
            String alergic, String speacialAtention, String observation, Owner owner) {
        this.clientNumber = clientNumber;
        this.petName = petName;
        this.race = race;
        this.color = color;
        this.alergic = alergic;
        this.speacialAtention = speacialAtention;
        this.observation = observation;
        this.owner = owner;
    }
    
    public int getId(){
        return id;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergic() {
        return alergic;
    }

    public void setAlergic(String isAlergic) {
        this.alergic = isAlergic;
    }

    public String getSpeacialAtention() {
        return speacialAtention;
    }

    public void setSpeacialAtention(String speacialAtention) {
        this.speacialAtention = speacialAtention;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
}
