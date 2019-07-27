/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;
import com.workshop.car.Entity.Invoicedetails;
import com.workshop.car.Entity.Invoicemain;
import com.workshop.car.Service.InvoicemainService;
import java.util.Collection;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
public class InvoicemainController {

public class InvoicedetailsController {
             @Autowired
             InvoicemainService invoicemainService;
         @RequestMapping(value = "/AddInvoicemain",method = RequestMethod.POST)
         public String ADD(@RequestBody Invoicemain  invoicemain){
         if(invoicemainService.save(invoicemain)){
            return "مبروك";    
            }else{
            return "بلح";
        }
        }
             @RequestMapping(value = "getallInvoicemain", method = RequestMethod.GET)
            public List<Invoicemain> getAll(){
            return invoicemainService.getAll();
     }
              @RequestMapping(value = "findByInvoiceno", method = RequestMethod.GET)
            public Collection<Invoicemain> findByInvoiceno(@PathParam("invoiceno")String invoiceno){
                
                return invoicemainService.findByInvoiceno(invoiceno);
            }
}
}
