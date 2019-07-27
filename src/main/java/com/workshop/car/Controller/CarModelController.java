/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.CarModel;
import com.workshop.car.Service.CarModelService;
import com.workshop.car.dto.CarModelDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GOHER
 */
@RestController
@RequestMapping("/CarModel")
public class CarModelController {
    @Autowired
    CarModelService carModelService;
     @RequestMapping(value = "/AddCarModel", method = RequestMethod.POST)
    public String ADD(@RequestBody CarModel carModel){
        return ADD(carModel);
    }
      @RequestMapping(value = "/getallCarModel", method = RequestMethod.GET)
    public Collection < CarModelDto> getall() {
        List<CarModelDto> CarModels = new ArrayList<>();
        for (CarModel carModel : carModelService.getall()) {
            CarModels.add(new CarModelDto(carModel));
        }
        return CarModels;
    }
}
