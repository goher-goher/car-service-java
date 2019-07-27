/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.CarModel;
import com.workshop.car.Repository.CarModelRepository;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */

@Service
public class CarModelServiceImp implements CarModelService{
        
    @Autowired
   
    CarModelRepository carModelRepository;
    
    
    @Override
    public boolean save(CarModel carModel) {
    return (carModelRepository.save(carModel)!=null);
    }

    @Override
    public Collection<CarModel> getall() {
        return carModelRepository.findAll();
    }

}
