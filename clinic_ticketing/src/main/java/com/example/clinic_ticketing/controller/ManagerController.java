package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.staff.Manager;
import com.example.clinic_ticketing.service.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController extends AbstractBaseController<ManagerService, Manager> {
}
