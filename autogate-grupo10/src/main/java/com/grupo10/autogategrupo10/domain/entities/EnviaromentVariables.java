package com.grupo10.autogategrupo10.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.UUID;

@Entity
@Table(name = "agp_enviroment_variables")
@Data
public class EnviaromentVariables {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int timeLeftQrTime;
    private int validityMargin;
    private Time startLimitTime;
    private Time endLimitTime;
    private int visitLimit;

}
