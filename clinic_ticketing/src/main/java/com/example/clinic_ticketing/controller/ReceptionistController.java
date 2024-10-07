package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.staff.Receptionist;
import com.example.clinic_ticketing.service.ReceptionistService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receptionist")
public class ReceptionistController extends AbstractBaseController<ReceptionistService, Receptionist>{
}
