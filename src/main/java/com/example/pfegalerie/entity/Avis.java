package com.example.pfegalerie.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "avis")
public class Avis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String commentaires;
    private Long note;

    @OneToMany(cascade = {
            CascadeType.ALL
    },mappedBy = "avis")
    private Set<Types> types;
}
