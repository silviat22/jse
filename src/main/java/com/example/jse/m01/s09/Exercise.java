/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s09;

/**
 * A very simple exercise in three steps on array
 */
public class Exercise {
    /**
     * <li>(1) create an array with "one", "two", "three", "four" in it
     * <li>(2) print the number of its elements
     * <li>(3) print the last element
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // 1
        String[] numeri = new String[4];
        numeri[0] = "one";
        numeri[1] = "two";
        numeri[2] = "three";
        numeri[3] = "four";

        // 2
        System.out.println(numeri.length);

        // 3
        System.out.println(numeri[numeri.length - 1]);
        System.out.println("Done");
    }
}
