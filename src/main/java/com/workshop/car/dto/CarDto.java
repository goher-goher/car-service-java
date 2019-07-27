/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.dto;
import com.workshop.car.Entity.Car;
import com.workshop.car.Entity.CarMaunfacture;
import com.workshop.car.Entity.CarModel;
import com.workshop.car.dto.CarMaunfactureDto;
import com.workshop.car.dto.CarModelDto;

/**
 *
 * @author GOHER
 */
public class CarDto {

    private int id;
    private String carmodel;
    private String carplateno;
    private int carmanufactureid;
    private String carmanufacture;
    public CarDto() {
        
    }

    public CarDto(Car car) {
        setId(car.getId());
        //setCarmodel(new CarModel(car.getCarmodel().getId(), car.getCarmodel().getCarmodel()));
        setCarplateno(car.getCarplateno());
        setCarmodel(car.getCarmodel().getCarmodel());
        setCarmanufactureid(car.getCarmodel().getCarmanufactureid().getId());
         setCarmanufacture(car.getCarmodel().getCarmanufactureid().getCarmanufacture());
         setCarmanufacture(carmanufacture);
        //  setCarmodel(new CarModel(carmodel.getCarmanufactureid().getId()));
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCarplateno() {
        return carplateno;
    }

    public void setCarplateno(String carplateno) {
        this.carplateno = carplateno;
    }

    public int getCarmanufactureid() {
        return carmanufactureid;
    }

    public void setCarmanufactureid(int carmanufactureid) {
        this.carmanufactureid = carmanufactureid;
    }

    public String getCarmanufacture() {
        return carmanufacture;
    }

    public void setCarmanufacture(String carmanufacture) {
        this.carmanufacture = carmanufacture;
    }
    
}