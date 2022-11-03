package org.example.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class XyzTyres implements ITyres{
    public void rotate() {
        System.out.println("XYZ tyres");
    }
}
