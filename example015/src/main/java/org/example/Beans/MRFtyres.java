package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class MRFtyres implements ITyres{
    public void rotate() {
        System.out.println("MRF tyres rotate");
    }
}
