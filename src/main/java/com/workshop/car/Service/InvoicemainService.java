/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Invoicemain;
import java.util.Collection;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Repository
@Service
public interface InvoicemainService {
      public boolean save(Invoicemain invoicemain);
      public List<Invoicemain>getAll();
      public Collection<Invoicemain>findByInvoiceno(String invoiceno);
}
