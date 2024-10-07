package com.example.clinic_ticketing.model.entity.patient;

import com.example.clinic_ticketing.model.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
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
@Table(name = "patient")
public class Patient extends AbstractBaseEntity
{
    @Column(name = "PATIENT_NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "PATIENT_FAMILY", length = 50, nullable = false)
    private String family;

    @Column(name = "PATIENT_GENDER", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "PATIENT_FATHER_NAME", length = 50, nullable = false)
    private String patientFatherName;

    @Column(name = "PATIENT_NATIONAL_CODE", length = 10, nullable = false, unique = true)
    @Pattern(regexp = "^[0-9]{10}$")
    private String nationalCode;

    @Column(name = "PATIENT_PHONE_NUMBER", length = 11, nullable = false, unique = true)
    @Pattern(regexp = "^[0-9]{10}$")
    private String phoneNumber;

    @Column(name = "PATIENT_BIRTH_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;
}