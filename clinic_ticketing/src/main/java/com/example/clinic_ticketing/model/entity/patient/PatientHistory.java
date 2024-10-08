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
@SequenceGenerator(name = "PATIENT_HISTORY_SEQ", sequenceName = "PATIENT_HISTORY_SEQ", initialValue = 1, allocationSize = 50)
public class PatientHistory extends AbstractBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PATIENT_HISTORY_SEQ")
    private Long id;

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

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
}