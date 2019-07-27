/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Customer;
import com.workshop.car.Repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;               
    @Override
    public boolean save(Customer customer) {
      
    return (customerRepository.save(customer)!=null);
    }

    @Override
    public List<Customer> findByNmae(String customername) {
     return customerRepository.findByCustomermobile(customername);
    }

    @Override
    public List<Customer> findBymobile(String customermobile) {
    return customerRepository.findByCustomermobile(customermobile);
    
    }
    
}
