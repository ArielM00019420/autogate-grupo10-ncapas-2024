package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "agp_entrees")
@Data
public class Entree {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String entreeWay;
    private Timestamp dateTimeEntree;

    @OneToOne
    private NoInviteEntree noInviteEntree;
    @ManyToOne
    private House house;
    @ManyToOne
    private DoorWay doorWay;
}
