package com.melck.mckmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melck.mckmeta.entities.Sale;
import com.melck.mckmeta.services.SaleService;
import com.melck.mckmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public ResponseEntity<Page<Sale>> findSales(
        @RequestParam(value = "minDate", defaultValue = "") String minDate,
        @RequestParam(value = "maxDate", defaultValue = "")String maxDate,
        Pageable pageable){
        return ResponseEntity.ok().body(service.findSales(minDate, maxDate, pageable));
    }

    @GetMapping(value = "/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
    
}
