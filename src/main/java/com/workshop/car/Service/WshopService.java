/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Wshop;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Service
@Repository
public interface WshopService {
    public boolean save(Wshop wshop);
    public List<Wshop>getall();
}
