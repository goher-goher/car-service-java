/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Employeejob;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
public interface EmployeejobService {
     public boolean save(Employeejob employeejob);
     public List<Employeejob>getall();
   
}
