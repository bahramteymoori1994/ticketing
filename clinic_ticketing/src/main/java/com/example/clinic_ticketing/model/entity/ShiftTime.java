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
@Table(name = "shift_time")
@SequenceGenerator(name = "SHIFT_TIME_SEQ", sequenceName = "SHIFT_TIME_SEQ", initialValue = 1, allocationSize = 50)
public class ShiftTime extends AbstractBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHIFT_TIME_SEQ")
    private Long id;
}