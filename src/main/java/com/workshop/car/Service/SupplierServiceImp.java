/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Supplier;
import com.workshop.car.Repository.SupplierRepository;
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
public class SupplierServiceImp implements SupplierService{
    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public boolean save(Supplier supplier) {
    return (supplierRepository.save(supplier)!=null);
    }

    @Override
    public List<Supplier> getall() {
    return supplierRepository.findAll();
    }
    
}
