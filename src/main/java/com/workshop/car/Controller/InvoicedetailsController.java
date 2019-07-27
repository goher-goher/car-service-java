/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Invoicedetails;
import com.workshop.car.Service.InvoicedetailsService;

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
@RequestMapping("/Invoicedetails")
public class InvoicedetailsController {
             @Autowired
             InvoicedetailsService invoicedetailsService;
         @RequestMapping(value = "/AddInvoicedetails",method = RequestMethod.POST)
         public String ADD(@RequestBody Invoicedetails invoicedetails){
         if(invoicedetailsService.save(invoicedetails)){
            return "مبروك";    
            }else{
            return "بلح";
        }
        }
             @RequestMapping(value = "getallInvoicedetails", method = RequestMethod.GET)
            public List<Invoicedetails> getAll(){
            return invoicedetailsService.getAll();
     }
}
    

