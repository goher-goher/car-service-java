/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Servicetype;
import com.workshop.car.Repository.ServicetypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
public class ServicetypeServiceImp implements ServicetypeService{
    @Autowired
    ServicetypeRepository servicetypeRepository;
    @Override
    public boolean save(Servicetype servicetype) {
    return (servicetypeRepository.save(servicetype)!=null);
    }

    @Override
    public List<Servicetype> getall() {
    return servicetypeRepository.findAll();
    }
    
}
