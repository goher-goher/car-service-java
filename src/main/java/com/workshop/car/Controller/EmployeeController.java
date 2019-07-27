/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;


import com.workshop.car.Entity.Employee;
import com.workshop.car.Service.EmployeeService;
import java.util.Collection;
import javax.websocket.server.PathParam;
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
@RequestMapping("/Employee")
public class EmployeeController {
        @Autowired
        EmployeeService employeeService;
        
         @RequestMapping(value = "/AddEmployee",method = RequestMethod.POST)
         public String ADD(@RequestBody Employee employee){
         if(employeeService.save(employee)){
            return "مبروك";    
            }else{
            return "بلح";
        }
        }
      @RequestMapping(value = "/findbyempname", method = RequestMethod.GET)
    public Collection<Employee>getall(@PathParam("empname") String empname){
        
        return employeeService.GetName(empname);
   
    }
      @RequestMapping(value = "/findbycustomermobile", method = RequestMethod.GET)
        public Collection<Employee>GetAll(@PathParam("empmobile")String empmobile){
            return employeeService.Getmobile(empmobile);
        }
}
         
         
         
         

