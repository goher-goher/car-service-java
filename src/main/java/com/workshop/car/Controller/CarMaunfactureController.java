package com.workshop.car.Controller;
import com.workshop.car.Entity.CarMaunfacture;
import com.workshop.car.Service.CarMaunfactureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GOHER
 */
@RestController
@RequestMapping("/CarMaunfacture")
public class CarMaunfactureController {
         @Autowired
         CarMaunfactureService carMaunfactureService;
         @RequestMapping(value ="/addCarMaunfacture", method = RequestMethod.POST)
    public String add(@RequestBody CarMaunfacture carMaunfacture) {
         if (carMaunfactureService.save(carMaunfacture)) {
            return "Done";
         } else {
            return "Fail";
         }
    }
         @RequestMapping(value = "getallCarMaunfacture", method = RequestMethod.GET)
            public List<CarMaunfacture> getAll(){
            return carMaunfactureService.getAll();
     }
    
    
    
}
