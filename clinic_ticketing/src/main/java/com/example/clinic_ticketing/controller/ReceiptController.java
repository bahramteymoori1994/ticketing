package com.example.clinic_ticketing.controller;

import com.example.clinic_ticketing.model.entity.Receipt;
import com.example.clinic_ticketing.service.ReceiptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipt")
public class ReceiptController extends AbstractBaseController<ReceiptService, Receipt>{
}
