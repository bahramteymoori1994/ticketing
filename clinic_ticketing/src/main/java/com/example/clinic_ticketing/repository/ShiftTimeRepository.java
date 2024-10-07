package com.example.clinic_ticketing.repository;

import com.example.clinic_ticketing.model.entity.ShiftTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftTimeRepository extends JpaRepository<ShiftTime, Long> {
}
