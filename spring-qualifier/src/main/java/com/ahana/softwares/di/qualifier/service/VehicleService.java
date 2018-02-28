package com.ahana.softwares.di.qualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ahana.softwares.di.qualifier.bean.Vehicle;

@Component
public class VehicleService {

   @Autowired
   //@Qualifier("bikeBean")
   
   private Vehicle vehicle;

   public void service() {
      vehicle.start();
      vehicle.stop();
   }
}
