package com.example.clinic_ticketing.repository;

import com.example.clinic_ticketing.model.entity.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionRepository extends JpaRepository<Reception, Long> {
}
