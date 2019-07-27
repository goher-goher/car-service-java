/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Repository;

import com.workshop.car.Entity.Employeejob;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author GOHER
 */
public interface EmployeejobRepository extends JpaRepository<Employeejob, Integer>{
    
}
