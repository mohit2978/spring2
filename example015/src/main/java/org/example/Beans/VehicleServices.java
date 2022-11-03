package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    iSpeaker sp;
    ITyres ty;
    @Autowired
    public VehicleServices(iSpeaker sp, ITyres ty) {
        this.sp = sp;
        this.ty = ty;
    }
    public void doJob(){
        sp.makesound();
        ty.rotate();
    }
}
