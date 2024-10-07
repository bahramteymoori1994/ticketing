package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.MedicalService;
import com.example.clinic_ticketing.service.MedicalServiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medical_service")
public class MedicalServiceController extends AbstractBaseController<MedicalServiceService, MedicalService> {
}
