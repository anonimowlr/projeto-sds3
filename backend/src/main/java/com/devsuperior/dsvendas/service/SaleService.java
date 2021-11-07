/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.dtos.SaleSucessDTO;
import com.devsuperior.dsvendas.dtos.SaleSumDTO;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author F5078775
 */
@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;
    
    @Autowired
    private SellerRepository sellerRepository;
    
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        
        sellerRepository.findAll(); // para naoi ficar indo ao banco todo momento que precisar de seller para vincular a sale
        Page<SaleDTO> listaSaleDTO = saleRepository.findAll(pageable).map(sale -> new SaleDTO(sale));
        
        
        return  listaSaleDTO;
    }
    
    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedByBySeller(){
        
        return saleRepository.amountGroupedByBySeller();
        
    }

    public List<SaleSucessDTO> successGroupedByBySeller() {
      return saleRepository.successGroupedByBySeller();
    }
    
    
    
}
