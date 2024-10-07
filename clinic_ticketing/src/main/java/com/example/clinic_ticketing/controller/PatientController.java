package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.patient.Patient;
import com.example.clinic_ticketing.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController extends AbstractBaseController<PatientService, Patient>{
}
