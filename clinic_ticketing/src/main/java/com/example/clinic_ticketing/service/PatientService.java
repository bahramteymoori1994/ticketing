package com.example.clinic_ticketing.service;

import com.example.clinic_ticketing.model.entity.patient.Patient;
import com.example.clinic_ticketing.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends AbstractBaseService<PatientRepository, Patient>{
}
