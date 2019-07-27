/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workshop.car.Service;

import com.workshop.car.Entity.Sparepart;
import java.util.Collection;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author GOHER
 */
@Repository
@Service
public interface SparepartService {
      //الاضافه للكل مره واحده
      public boolean save(Sparepart sparepart);
      //يتم الاستدعاء من الداتا كله
       public Collection<Sparepart>getall();
      //يتم البحث عن طريق الاسم
       public Collection<Sparepart>findBySparepartname(String sparepartname);
      //يتم البحث عن طريق الرقم 
      public Collection<Sparepart>findBySaprepartno(String saprepartno);
}
