/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15;

/**
 * Cat is a Pet
 */
public class Cat extends Pet { //(indirettamente implementa brushable)
    /**
     * Canonical constructor
     * 
     * @param name the cat name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Cat noise
     */
    public void meow() { //metodo specifico per i gatti Cat (nel pet non era definito)
        System.out.println("meow!");
    }

    @Override
    public void makeNoise() {
        meow();
    }
}