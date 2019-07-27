/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Customer;
import com.workshop.car.Service.CustomerService;
import java.util.Collection;
import java.util.List;
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
@RequestMapping("/Customer")
public class CustomerController {
 
    CustomerService customerService;
    @RequestMapping(value = "/AddCustomer",method = RequestMethod.POST)
    public String ADD(@RequestBody Customer customer){
        if(customerService.save(customer)){
            return "مبروك";    
            }else{
            return "بلح";
        }
    }
     @RequestMapping(value = "/findbycustomername", method = RequestMethod.GET)
    public Collection<Customer>getall(@PathParam("customername") String customername){
        
        return customerService.findByNmae(customername);
   
    }

        @RequestMapping(value = "/findbycustomermobile", method = RequestMethod.GET)
        public Collection<Customer>GetAll(@PathParam("customermobile")String customermobile){
            return customerService.findBymobile(customermobile);
        }
        
}
  

