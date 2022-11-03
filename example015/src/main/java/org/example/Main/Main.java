package org.example.Main;

import org.example.Beans.*;
import org.example.Config.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(config.class);
        var p=context.getBean(Person.class);
        var vc=context.getBean(VehicleServices.class);
        var v=context.getBean(Vehicle.class);
        var t=context.getBean(ITyres.class);
        var s=context.getBean( iSpeaker.class);
        p.run();

    }
}