/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Employeejob;
import com.workshop.car.Repository.EmployeejobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Repository
@Service
public class EmployeejobServiceImp implements EmployeejobService{
     @Autowired
     EmployeejobRepository employeejobRepository;
    
    @Override
    public boolean save(Employeejob employeejob) {
        return (employeejobRepository.save(employeejob)!=null);
    
    }

    @Override
    public List<Employeejob> getall() {
      
        return employeejobRepository.findAll();
    }
    
}
