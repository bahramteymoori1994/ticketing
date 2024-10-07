package com.example.clinic_ticketing.repository;

import com.example.clinic_ticketing.model.entity.staff.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {
}
