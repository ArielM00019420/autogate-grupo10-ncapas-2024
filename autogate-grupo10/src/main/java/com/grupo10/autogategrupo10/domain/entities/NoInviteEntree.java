package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "agp_noInvite")
@Data
public class NoInviteEntree {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String fullName;
    private String dui;
    private String reason;

    @OneToOne
    private Entree entree;
}
