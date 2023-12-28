package com.example.pfegalerie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "images")
public class Images implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String description;
    private String titre;
    private Long prix;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Image_Categories",joinColumns = @JoinColumn(name = "Categories_id"),inverseJoinColumns = @JoinColumn(name = "Images_id"))
    private Set<Categories> categories ;
}
