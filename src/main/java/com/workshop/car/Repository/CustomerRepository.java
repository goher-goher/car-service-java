/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Repository;

import com.workshop.car.Entity.Customer;
import static java.util.Collections.list;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



/**
 *
 * @author GOHER
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    List<Customer>findByCustomername(@Param("customername")String customername);
    List<Customer>findByCustomermobile(@Param("customermobile")String customermobile);
}
