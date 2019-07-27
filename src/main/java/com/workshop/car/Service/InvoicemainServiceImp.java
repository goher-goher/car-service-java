/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Invoicemain;
import com.workshop.car.Repository.InvoicemainRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
public class InvoicemainServiceImp implements InvoicemainService{
    @Autowired
    InvoicemainRepository invoicemainRepository;
    @Override
    public boolean save(Invoicemain invoicemain) {
    return (invoicemainRepository.save(invoicemain)!=null);
    
    }

    @Override
    public List<Invoicemain> getAll() {
    return invoicemainRepository.findAll();
    }

    @Override
    public Collection<Invoicemain> findByInvoiceno(String invoiceno) {
      //البحث برقم الفاتور 
    return invoicemainRepository.findByInvoiceno(invoiceno);
    }
    
}
