package com.ahana.softwares.di.qualifier.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
@Primary
public class Bike implements Vehicle{

   @Override
   public void start() {
      System.out.println("Bike started");
   }

   @Override
   public void stop() {
      System.out.println("Bike stopped");
   }
}
