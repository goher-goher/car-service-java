/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Unit;
import com.workshop.car.Repository.UnitRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
@Repository
public class UnitServiceImp implements UnitService{
    @Autowired
    UnitRepository unitRepository;
    @Override
    public boolean save(Unit unit) {
    
    return (unitRepository.save(unit)!=null);
    }

    @Override
    public List<Unit> getall() {
    return unitRepository.findAll();
    }
    
}
