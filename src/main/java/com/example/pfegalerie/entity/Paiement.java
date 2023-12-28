package com.example.pfegalerie.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@Entity
@Table (name = "paiement")
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long montant;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
