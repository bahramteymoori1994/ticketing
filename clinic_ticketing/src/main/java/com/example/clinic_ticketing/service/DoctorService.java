package com.example.clinic_ticketing.service;

import com.example.clinic_ticketing.model.entity.staff.Doctor;
import com.example.clinic_ticketing.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends AbstractBaseService<DoctorRepository, Doctor>{
}
