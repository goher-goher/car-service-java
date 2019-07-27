/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Sparepart;
import com.workshop.car.Repository.SparepartRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author GOHER
 */
@Service
public class SparepartServiceImp implements SparepartService{
  @Autowired
    
    SparepartRepository sparepartRepository;
   

    @Override
    public boolean save(Sparepart sparepart) {
    return (sparepartRepository.save(sparepart)!=null);
    }

    @Override
    public Collection<Sparepart> getall() {
    return sparepartRepository.findAll();
    }

    @Override
    public Collection<Sparepart> findBySparepartname(String sparepartname) {
            return sparepartRepository.findBySaprepartno(sparepartname);
    }

    @Override
    public Collection<Sparepart> findBySaprepartno(String saprepartno) {
    
    return sparepartRepository.findBySaprepartno(saprepartno);
    }
  

 
}
