package com.melck.mckmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melck.mckmeta.entities.Sale;
import com.melck.mckmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SasleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<List<Sale>> findSales(){
        return ResponseEntity.ok().body(service.findSales());
        
    }
    
}
