/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.service.SaleService;
import com.devsuperior.dsvendas.service.SellerService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author F5078775
 */
@RestController
@RequestMapping(value = "sales")
@CrossOrigin("*")
public class SaleController {
    
    @Autowired
    private SaleService saleService;
    
    
    @GetMapping
    public ResponseEntity<Page<SaleDTO>> listarTodos(Pageable pageable){
        
       Page<SaleDTO> listaSaleDTOs = saleService.findAll(pageable);
     
       
       return ResponseEntity.ok().body(listaSaleDTOs);
       
      
        
    }
    
}
