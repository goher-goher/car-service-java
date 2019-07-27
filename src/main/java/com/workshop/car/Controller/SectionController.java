/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Controller;

import com.workshop.car.Entity.Section;
import com.workshop.car.Service.SectionService;
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

@RequestMapping("/Section")
public class SectionController {
    @Autowired
    SectionService sectionService;
    @RequestMapping(value = "/addSection",method = RequestMethod.POST)
    public String Add(@RequestBody Section section){
        if(sectionService.save(section)){
            return "مبروك";
        }else{
            return "ادخل البيانات تاني يا بابا";
        }
    }
    @RequestMapping(value = "/getallsection",method = RequestMethod.GET)
    public Collection<Section>getAll(){
        return sectionService.getall();
    }
}
