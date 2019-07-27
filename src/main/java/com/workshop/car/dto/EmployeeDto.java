/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.dto;

import com.workshop.car.Entity.Employee;

/**
 *
 * @author GOHER
 */
public class EmployeeDto {
    
    private  String empsection;
    private String empjob;
    
        public EmployeeDto emp(Employee employee ){
        return null;
        }


    public String getEmpsection() {
        return empsection;
    }

    public void setEmpsection(String empsection) {
        this.empsection = empsection;
    }

    public String getEmpjob() {
        return empjob;
    }

    public void setEmpjob(String empjob) {
        this.empjob = empjob;
    }
    
}
