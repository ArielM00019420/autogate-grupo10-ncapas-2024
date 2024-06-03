package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "agp_roles")
@Data
public class Invitation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Timestamp startDate;
    private Timestamp finishDate;
    private String days;
    private boolean status;
    private boolean type;

}
