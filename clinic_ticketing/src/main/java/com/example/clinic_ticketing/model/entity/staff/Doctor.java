package com.example.clinic_ticketing.model.entity.staff;

import com.example.clinic_ticketing.model.enums.DoctorSpecialityMajor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@SuperBuilder
@Table(name = "doctor")
@SequenceGenerator(name = "DOCTOR_SEQ", sequenceName = "DOCTOR_SEQ", initialValue = 1, allocationSize = 50)
public class Doctor extends AbstractStaffBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCTOR_SEQ")
    private Long id;

    @Column(name = "SPECIALITY", length = 50, nullable = false)
    private String speciality;

    @Column(name = "SPECIALITY_MAJOR")
    @Enumerated(value = EnumType.STRING)
    private DoctorSpecialityMajor doctorSpecialityMajor;
}