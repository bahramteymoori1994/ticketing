package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.Reception;
import com.example.clinic_ticketing.service.ReceptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reception")
public class ReceptionController extends AbstractBaseController<ReceptionService, Reception>{
}
