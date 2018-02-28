package com.ahana.softwares.di.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahana.softwares.di.qualifier.service.VehicleService;

public class MainApp {
   public static void main(String[] args) {
	   
      AnnotationConfigApplicationContext context =       new AnnotationConfigApplicationContext();
      // Scan beans
      context.scan("com.ahana");
      context.refresh();

      VehicleService vehicle = context.getBean(VehicleService.class);
      vehicle.service();

      context.close();
   }
}
