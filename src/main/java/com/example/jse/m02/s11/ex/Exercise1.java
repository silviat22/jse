/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise1 {
    /**
     * Print all values in [0 .. 9] two times:
     * <li>By while loop
     * <li>By do-while loop
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("****");
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}

    