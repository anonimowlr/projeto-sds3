/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dtos.SaleSucessDTO;
import com.devsuperior.dsvendas.dtos.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author F5078775
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    
    @Query("SELECT new  com.devsuperior.dsvendas.dtos.SaleSumDTO(obj.seller,SUM(obj.amount)) "
            + " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedByBySeller();
    
    @Query("SELECT new  com.devsuperior.dsvendas.dtos.SaleSucessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals)) "
            + " FROM Sale as obj GROUP BY obj.seller")
    List<SaleSucessDTO> successGroupedByBySeller();
    
    
    
    
    
}
