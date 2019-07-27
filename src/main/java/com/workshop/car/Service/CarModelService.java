/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.CarModel;
import java.util.Collection;

import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */

@Service
public interface CarModelService {
    public boolean save(CarModel carModel);
     public Collection<CarModel>getall();

     
}
