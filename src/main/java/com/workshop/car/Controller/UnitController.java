/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Unit;
import com.workshop.car.Service.UnitService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GOHER
 */
@RestController
@RequestMapping("/Unit")
public class UnitController {
    @Autowired
    UnitService unitService;
    @RequestMapping(value = "/adduint",method = RequestMethod.POST)
    public String Add(Unit unit){
        if(unitService.save(unit)){
            return "مبروك";
        }else{
            return "ادخل البيانات مره تانيه ";
        }
    }
    @RequestMapping(value = "/getalluint",method = RequestMethod.GET)
    public Collection<Unit>getAll(){
        return  unitService.getall();
    }
}
