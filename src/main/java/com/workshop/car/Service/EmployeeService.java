/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;


import com.workshop.car.Entity.Employee;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service

public interface EmployeeService {
        public boolean save(Employee employee);
        public Collection<Employee>getall();
        List<Employee>GetName(String Empname);
        List<Employee>Getmobile(String Empmobile);
}
