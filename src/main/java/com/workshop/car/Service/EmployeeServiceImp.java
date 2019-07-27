/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Employee;
import com.workshop.car.Repository.EmployeeRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
public class EmployeeServiceImp implements EmployeeService{
     @Autowired
     EmployeeRepository employeeRepository;
     @Override
    public boolean save(Employee employee) {
    return (employeeRepository.save(employee)!=null);
    }

    @Override
    public Collection<Employee> getall() {
    return employeeRepository.findAll();
    }
    
    @Override
    public List<Employee> GetName(String Empname) {
    
    return employeeRepository.findByEmpname(Empname);
    }

    @Override
    public List<Employee> Getmobile(String Empmobile) {
    return employeeRepository.findByEmpmobile(Empmobile);
    }
    
}
