/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Joborder;
import com.workshop.car.Service.JoborderService;
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
@RequestMapping("/Joborder")
public class JoborderController {
    @Autowired
    JoborderService joborderService;
    @RequestMapping(value ="/AddJoborder",method = RequestMethod.POST)
    public String Add(@RequestBody Joborder joborder){
        if(joborderService.save(joborder)){
            return "مبروك";
        }else{
            return "ادخل البيانات مره تانيه يا بابا";
        }
        
    }
    @RequestMapping(value ="/gatalljoborder",method = RequestMethod.GET)
    public Collection<Joborder>getAll(){
        return joborderService.getAll();
    }
}
