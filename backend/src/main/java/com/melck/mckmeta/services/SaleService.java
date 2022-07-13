package com.melck.mckmeta.services;

import com.melck.mckmeta.entities.Sale;
import com.melck.mckmeta.repositories.SaleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
    
}
