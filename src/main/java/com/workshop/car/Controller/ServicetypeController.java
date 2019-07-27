/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Servicetype;
import com.workshop.car.Service.ServicetypeService;
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
@RequestMapping("/Servicetype")
public class ServicetypeController {
    @Autowired
    ServicetypeService servicetypeService;
    @RequestMapping(value = "/addservicetype",method = RequestMethod.POST)
    public String ADD(Servicetype servicetype){
        if(servicetypeService.save(servicetype)){
            return "مبروك";
        }else{
            return "ادخل البيانات مره تانيه";
        }
    }
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public Collection<Servicetype>getAll(){
        
        return servicetypeService.getall();
    }
}
