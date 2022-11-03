package org.example.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements iSpeaker{
    public void makesound() {
        System.out.println("sony sound baby");
    }
}
