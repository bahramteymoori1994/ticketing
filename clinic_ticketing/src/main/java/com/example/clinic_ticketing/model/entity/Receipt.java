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
@Table(name = "receipt")
@SequenceGenerator(name = "RECEIPT_SEQ", sequenceName = "RECEIPT_SEQ", initialValue = 1, allocationSize = 50)
public class Receipt extends AbstractBaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECEIPT_SEQ")
    private Long id;
}