/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;
import com.workshop.car.Entity.CarMaunfacture;
import com.workshop.car.Repository.CarMaunfactureRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
public class CarMaunfactureServiceImp implements CarMaunfactureService{
     @Autowired
        CarMaunfactureRepository carMaunfactureRepository;

    @Override
    public boolean save(CarMaunfacture carMaunfacture) {
   
    return carMaunfactureRepository.save(carMaunfacture)!=null;
    }

    @Override
    public List<CarMaunfacture> getAll() {
    
    return carMaunfactureRepository.findAll();
    }
 
}

