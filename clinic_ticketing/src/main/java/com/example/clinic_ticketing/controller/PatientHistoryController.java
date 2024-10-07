package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.patient.PatientHistory;
import com.example.clinic_ticketing.service.PatientHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient_history")
public class PatientHistoryController extends AbstractBaseController<PatientHistoryService, PatientHistory>{
}
