/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.dto;

import com.workshop.car.Entity.CarMaunfacture;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author GOHER
 */
public class CarMaunfactureDto {
    private int id;
    private  String CarMaunfacture;
    public CarMaunfactureDto(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarMaunfacture() {
        return CarMaunfacture;
    }

    public void setCarMaunfacture(String CarMaunfacture) {
        this.CarMaunfacture = CarMaunfacture;
    }
    
}


