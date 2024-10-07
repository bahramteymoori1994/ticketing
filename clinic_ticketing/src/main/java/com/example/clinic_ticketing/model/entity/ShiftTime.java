package com.example.clinic_ticketing.model.entity;

import com.example.clinic_ticketing.model.entity.patient.AbstractBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class ShiftTime extends AbstractBaseEntity
{

}