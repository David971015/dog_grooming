package com.mycompany.peluqueriacanina.logic;

import com.mycompany.peluqueriacanina.logic.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-09T13:53:10", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> petName;
    public static volatile SingularAttribute<Pet, Owner> owner;
    public static volatile SingularAttribute<Pet, String> speacialAtention;
    public static volatile SingularAttribute<Pet, String> race;
    public static volatile SingularAttribute<Pet, String> color;
    public static volatile SingularAttribute<Pet, String> alergic;
    public static volatile SingularAttribute<Pet, String> observation;
    public static volatile SingularAttribute<Pet, Integer> id;
    public static volatile SingularAttribute<Pet, String> clientNumber;

}