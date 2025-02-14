/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11;

/**
 * Robot is a Toy, Barking, Jumping
 */
public class Robot extends Toy implements Barking, Jumping {
    /**
     * No-arg constructor
     */
    public Robot() {
        super(10);
    }

    @Override
    public String bark() {
        return "B-A-R-K";
    }

    @Override
    public void jump() {
        System.out.println("Jump!");
    }

    // overload
    public void jump(int times) {
        for (int i = 0; i < times; i++) {
            jump();
        }
    }

    @Override
    public String toString() {
        return "Hello " + super.toString();
    }
}
