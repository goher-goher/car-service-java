/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Joborder;
import com.workshop.car.Repository.JoborderRepository;
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
public class JoborderServiceImp implements JoborderService{
    @Autowired
    JoborderRepository joborderRepository;
    @Override
    public boolean save(Joborder joborder) {
    return (joborderRepository.save(joborder)!=null);
    }

    @Override
    public List<Joborder> getAll() {
    return joborderRepository.findAll();
    }
    
}
