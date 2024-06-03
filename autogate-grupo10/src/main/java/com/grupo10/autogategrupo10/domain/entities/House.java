package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "agp_houses")
@Data
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String address;
    private String number;
    private boolean status;

    @OneToMany
    private List<User> user;
    @OneToMany
    private List<Entree> entree;

}
