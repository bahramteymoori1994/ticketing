package com.example.clinic_ticketing.model.entity.staff;

import com.example.clinic_ticketing.model.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@ToString
public abstract class AbstractStaffBaseEntity
{
    @Version
    private Long version;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "FAMILY", length = 50, nullable = false)
    private String family;

    @Column(name = "GENDER", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "FATHER_NAME", length = 50, nullable = false)
    private String patientFatherName;

    @Column(name = "NATIONAL_CODE", length = 10, nullable = false, unique = true)
    @Pattern(regexp = "^[0-9]{10}$")
    private String nationalCode;

    @Column(name = "PHONE_NUMBER", length = 11, nullable = false, unique = true)
    @Pattern(regexp = "^[0-9]{10}$")
    private String phoneNumber;

    @Column(name = "BIRTH_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;
}