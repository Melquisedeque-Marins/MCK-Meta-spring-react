package com.melck.mckmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melck.mckmeta.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
