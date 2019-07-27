/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.dto;

import com.workshop.car.Entity.CarMaunfacture;
import com.workshop.car.Entity.CarModel;

/**
 *
 * @author GOHER
 */
public class CarModelDto {
    private int id;
    private  CarMaunfacture carMaunfacture;
    private  String  carmodel;
    
    public CarModelDto(CarModel carModel){
        setId(carMaunfacture.getId());
        setCarMaunfacture(new CarMaunfacture(getCarMaunfacture().getId()));
    
         }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarMaunfacture getCarMaunfacture() {
        return carMaunfacture;
    }

    public void setCarMaunfacture(CarMaunfacture carMaunfacture) {
        this.carMaunfacture = carMaunfacture;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }
    
}
