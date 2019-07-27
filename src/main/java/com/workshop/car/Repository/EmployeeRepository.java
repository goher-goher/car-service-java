/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Repository;

import com.workshop.car.Entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GOHER
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    List<Employee>findByEmpname(@Param("empname")String empname);
    List<Employee>findByEmpmobile(@Param("empmobile")String empmobile);
}
