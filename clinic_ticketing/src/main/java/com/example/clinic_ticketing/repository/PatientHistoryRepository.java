package com.example.clinic_ticketing.repository;

import com.example.clinic_ticketing.model.entity.patient.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryRepository extends JpaRepository<PatientHistory, Long> {
}
