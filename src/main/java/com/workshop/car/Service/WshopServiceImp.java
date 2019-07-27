/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Wshop;
import com.workshop.car.Repository.WshopRepository;
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
public class WshopServiceImp implements WshopService{
    @Autowired
    WshopRepository wshopRepository;
    @Override
    public boolean save(Wshop wshop) {
    return (wshopRepository.save(wshop)!=null);
    }

    @Override
    public List<Wshop> getall() {
       return wshopRepository.findAll();
    }
    
}
