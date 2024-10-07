package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.ShiftTime;
import com.example.clinic_ticketing.service.ShiftTimeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shift_time")
public class ShiftTimeController extends AbstractBaseController<ShiftTimeService, ShiftTime>{
}
