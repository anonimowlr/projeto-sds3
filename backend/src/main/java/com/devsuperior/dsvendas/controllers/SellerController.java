/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.service.SellerService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "sellers")
@CrossOrigin("*")
public class SellerController {
    
    @Autowired
    private SellerService sellerService;
    
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> listarTodos(){
        
       List<SellerDTO> listaSellerDTo = sellerService.findAll();
     
       
       return ResponseEntity.ok().body(listaSellerDTo);
       
      
        
    }
    
}
