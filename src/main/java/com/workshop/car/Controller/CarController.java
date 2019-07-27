/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Car;
import com.workshop.car.Service.CarService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.workshop.car.Entity.CarMaunfacture;
import com.workshop.car.dto.CarMaunfactureDto;
import com.workshop.car.Entity.CarModel;
import com.workshop.car.dto.CarModelDto;
import com.workshop.car.dto.CarDto;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
/**
 *
 * @author GOHER
 */

@RestController

@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;
  
    @RequestMapping(value = "/ADDCAR", method = RequestMethod.POST)
    public String SAVE(@RequestBody Car car) {
        if (carService.save(car)) {
            return "Done";
        } else {
            return "Fail";
        }
    }
      @GetMapping("/getallcar")
   // @RequestMapping(value = "/getallcar", method = RequestMethod.GET)
       public Collection<CarDto> getall() {
        List<CarDto> cars = new ArrayList<>();
        for (Car car : carService.getall()) {
            cars.add(new CarDto(car));
        }
        return cars;
    }
    @RequestMapping(value ="/getcarone",method = RequestMethod.GET)
    public Collection<CarDto>getcar(@PathParam("carplateno")String carplateno){
          Collection<Car>car=carService.findOne();
          Collection<CarDto>carDto=new ArrayList<>();
          
        for(Car corr:car){
            CarDto cardto=new CarDto();
              cardto.getId();
              cardto.getCarmanufactureid();
            cardto.getCarmanufacture();
            cardto.getCarplateno();
            cardto.getCarmodel();
         
        }
        return carDto;
    }
}

