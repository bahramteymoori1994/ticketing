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
public class Doctor extends AbstractStaffBaseEntity
{
    @Column(name = "SPECIALITY", length = 50, nullable = false)
    private String speciality;

    @Column(name = "SPECIALITY_MAJOR")
    @Enumerated(value = EnumType.STRING)
    private DoctorSpecialityMajor doctorSpecialityMajor;
}