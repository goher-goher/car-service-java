/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Supplier;
import com.workshop.car.Service.SupplierService;
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
@RequestMapping("/Supplier")
public class SupplierController {
    @Autowired
    SupplierService supplierService;
    @RequestMapping(value = "/ADDsupplier",method = RequestMethod.POST)
    public String ADD(Supplier supplier){
        if(supplierService.save(supplier)){
            return "مبروك";
        }else{
            return "ادخل البيانات مره تانيه";
        }
    }
    @RequestMapping(value = "/getallsupplier",method = RequestMethod.GET)
    public Collection<Supplier>getall(){
        return supplierService.getall();
    }
}
