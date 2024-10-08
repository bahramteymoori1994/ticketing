package com.example.clinic_ticketing.model.entity;

import com.example.clinic_ticketing.model.entity.patient.AbstractBaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@ToString
@Table(name = "reception")
@SequenceGenerator(name = "RECEPTION_SEQ", sequenceName = "RECEPTION_SEQ", initialValue = 1, allocationSize = 50)
public class Reception extends AbstractBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECEPTION_SEQ")
    private Long id;

    @Column(name = "DISEASE_TYPE", length = 50, nullable = false)
    private String patientDiseaseType;
}