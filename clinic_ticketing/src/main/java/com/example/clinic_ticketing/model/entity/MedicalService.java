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
@Table(name = "medical_service")
@SequenceGenerator(name = "MEDICAL_SERVICE_SEQ", sequenceName = "MEDICAL_SERVICE_SEQ",
initialValue = 1, allocationSize = 50)
public class MedicalService extends AbstractBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEDICAL_SERVICE_SEQ")
    private Long id;

    @Column(name = "MEDICAL_SERVICE", length = 50, nullable = false)
    private String medicalService;
}