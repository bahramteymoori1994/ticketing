package com.example.clinic_ticketing.model.entity.patient;

import com.example.clinic_ticketing.model.enums.IsCure;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@ToString
@Table(name = "patient_history")
public class PatientHistory extends AbstractBaseEntity
{
    @Column(name = "DISEASE_TYPE", length = 50, nullable = false)
    private String diseaseType;

    @Column(name = "DISEASE_CAUSE", length = 50, nullable = false)
    private String diseaseCause;

    @Column(name = "HOSPITAL_NAME", length = 50, nullable = false)
    private String hospitalName;

    @Column(name = "HOSPITILIZATION_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date hospitalizationDate;

    @Column(name = "IS_CURE", nullable = false)
    @Enumerated(EnumType.STRING)
    private IsCure isCure;
}