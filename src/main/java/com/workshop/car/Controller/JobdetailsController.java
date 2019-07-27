/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Jobdetails;
import com.workshop.car.Service.JobdetailsService;
import java.util.Collection;
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
@RequestMapping("/Jobdetails")
public class JobdetailsController {
    @Autowired
    JobdetailsService jobdetailsService;
    @RequestMapping(value = "/addjobdetails",method = RequestMethod.POST)
    public String ADD(@RequestBody Jobdetails jobdetails){
       if(jobdetailsService.save(jobdetails)){
           return "مبروك";
       }else{
           return "لايوجد بيانات ";
       }
    }
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
     public Collection<Jobdetails>getAll(){
         return jobdetailsService.getall();
     }
            
    
}
