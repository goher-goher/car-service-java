/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Repository;

import com.workshop.car.Entity.Car;

import static java.util.Collections.list;
import java.util.List;
import javax.persistence.NamedQueries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GOHER
 */
@Repository
//
public interface CarRepository extends JpaRepository<Car, Integer>{
    
    List<Car>findByCarplateno(@Param ("carplateno")String carplateno);
    
   // List<CarMaunfacture>findBycarmanufactureId(@Param("carmanufactureId")String carmanufactureId);
  
}
