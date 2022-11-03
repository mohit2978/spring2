package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    VehicleServices vc;
    @Autowired
    public Vehicle(VehicleServices vc) {
        this.vc = vc;
    }
    public void functionality(){
        vc.doJob();
    }
}
