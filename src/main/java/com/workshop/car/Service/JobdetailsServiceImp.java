/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Jobdetails;
import com.workshop.car.Repository.JobdetailsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
@Repository
public class JobdetailsServiceImp implements JobdetailsService{
    @Autowired
    JobdetailsRepository jobdetailsRepository;

    @Override
    public boolean save(Jobdetails jobdetails) {
        return (jobdetailsRepository.save(jobdetails)!=null);
    }

    @Override
    public List<Jobdetails> getall() {
      
    return jobdetailsRepository.findAll();
    }
}
