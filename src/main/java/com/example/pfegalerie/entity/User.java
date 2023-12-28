package com.example.pfegalerie.entity;

import com.example.pfegalerie.enumeration.TypeUser;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Setter
@Getter
@Entity
@Table (name = "app_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String password;
    private String email;
    private TypeUser typeUser;
    @OneToMany(cascade = {
            CascadeType.ALL
    },mappedBy = "user")
    private Set<Paiement> paiements;

}
