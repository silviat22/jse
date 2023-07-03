/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s13;

/**
 * Smoke test for the Dog-Poodle hierarchy
 */
public class SuperMain {
    public static void main(String[] args) {
        Dog poodle = new MiniPoodle("Fuffy", "Tom");
        System.out.println(poodle);
        poodle.bark();
    }
}
