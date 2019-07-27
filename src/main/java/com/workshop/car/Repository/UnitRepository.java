/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Repository;

import com.workshop.car.Entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GOHER
 */
@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer>{
    
}
