package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class BoatSpeaker implements iSpeaker{
    public void makesound() {
        System.out.println("Boat sound boooooooooooooooo");
    }
}
