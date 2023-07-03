package com.example.jse.m06.s02.esempio;

public class Labrador extends Dog {
    public Labrador(int frequency) {
        super(frequency);

    }

    @Override
    public void bark() {
        System.out.println("Sono un Labrador " + getFrequency());
    }
}
