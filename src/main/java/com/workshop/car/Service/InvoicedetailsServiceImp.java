/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Invoicedetails;
import com.workshop.car.Repository.InvoicedetailsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
@Repository
public class InvoicedetailsServiceImp implements InvoicedetailsService{
        @Autowired
        InvoicedetailsRepository  invoicedetailsRepository;
    @Override
    public boolean save(Invoicedetails invoicedetails) {
    return (invoicedetailsRepository.save(invoicedetails)!=null);
    }

    @Override
    public List<Invoicedetails> getAll() {
    return invoicedetailsRepository.findAll();
    }
    
}
