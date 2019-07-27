/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Sparepart;
import com.workshop.car.Service.SparepartService;
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
@RequestMapping("/sparepart")
public class SparepartController {
    @Autowired
    SparepartService sparepartService;
        @RequestMapping(value = "/ADDsparepart", method = RequestMethod.POST)
         public String add(@RequestBody Sparepart sparepart) {
        if (sparepartService.save(sparepart)) {
            
            return "Done";
        } else {
            return "Fail";
        }
         }
         @RequestMapping(value = "/getallsparepartname", method = RequestMethod.GET)
         public List<Sparepart>getall(){
             return null;
         }
}

