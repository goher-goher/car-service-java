/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Wshop;
import com.workshop.car.Service.WshopService;
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
@RequestMapping("/Wshope")
public class WshopController {
    @Autowired
    WshopService wshopeServive;
    @RequestMapping(value = "/addwshope",method = RequestMethod.POST)
    public String ADD(Wshop wshop){
        if(wshopeServive.save(wshop)){
            return "مبروك";
        }else{
            return "ادخل البيانات مره تانيه";
        }
    }
    @RequestMapping(value = "/getallwshope",method = RequestMethod.GET)
    public Collection<Wshop>getAll(){
        return wshopeServive.getall();
    }
}
