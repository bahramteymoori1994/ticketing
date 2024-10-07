package com.example.clinic_ticketing.model.entity.staff;

import com.example.clinic_ticketing.model.enums.Graduation;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
@Table(name = "manager")
public class Manager extends AbstractStaffBaseEntity
{
    @Column(name = "EMAIL", length = 100, unique = true, nullable = false)
    @Email(message = "Email must be set correctly")
    private String email;

    @Column(name = "MAJOR", length = 50, nullable = false)
    private String major;

    @Column(name = "GRADUATION", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Graduation graduation;
}