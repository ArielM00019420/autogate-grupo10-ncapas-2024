package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "agp_users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String mail;
    private String status;

    @ManyToOne
    private House house;
    @ManyToOne
    private Role role;
}
