/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Section;
import com.workshop.car.Repository.SectionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */@Service
public class SectionServiceImp implements SectionService{
    @Autowired
    SectionRepository sectionRepository;
    @Override
    public boolean save(Section section) {
    return (sectionRepository.save(section)!=null);
    }

    @Override
    public List<Section> getall() {
    return sectionRepository.findAll();
    }
    
}
