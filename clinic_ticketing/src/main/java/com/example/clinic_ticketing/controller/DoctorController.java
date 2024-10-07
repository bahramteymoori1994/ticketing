package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.staff.Doctor;
import com.example.clinic_ticketing.service.DoctorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController extends AbstractBaseController<DoctorService, Doctor>{
}
