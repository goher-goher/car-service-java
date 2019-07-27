/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Employeejob;
import com.workshop.car.Service.EmployeejobService;
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
@RequestMapping("/Employeejob")
public class EmployeejobController {
         @Autowired
         EmployeejobService employeejobService;
         @RequestMapping(value = "/AddCustomer",method = RequestMethod.POST)
         public String ADD(@RequestBody Employeejob employeejob){
         if(employeejobService.save(employeejob)){
            return "مبروك";    
            }else{
            return "بلح";
        }
        }
             @RequestMapping(value = "getallCarMaunfacture", method = RequestMethod.GET)
            public List<Employeejob> getAll(){
            return employeejobService.getall();
     }
}
