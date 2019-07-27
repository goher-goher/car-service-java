/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Car;
import com.workshop.car.Repository.CarRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service

public class CarServiceImp implements CarService{

    
    @Autowired
    CarRepository carRepository;
    
    
    @Override
    public boolean save(Car car) {
            return (carRepository.save(car)!=null);
    
    }

    @Override
    public Collection<Car> getall() {
            return carRepository.findAll();
    }

    @Override
    public List<Car> findOne() {
   return carRepository.findByCarplateno("carplateno");
    }
    
    
}
