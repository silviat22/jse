/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12.ex;

/**
 * Control flow - Loop: for
 */
public class Exercise5 {
    /**
     * Emulate multiplicative operators with the help of a for loop.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        // 1
        int multi = a * b;
        System.out.println("a * b = " + multi);
        // TODO (1) Get the same result without multiplying
        int prod = 0;
        int i = 0;
        while (i < b) {
            prod += a;
            i++;
        }
        System.out.println("a * b = " + prod);

        // 2
        int div = a / b;
        System.out.println("a / b = " + div);
        // TODO (2) Get the same result without dividing
        int temp = a;
        i = 0;

        while (temp >= b) {
            temp -= b;
            i++;
        }
        System.out.println("a / b = " + i);

        // 3
        int mod = a % b;
        System.out.println("a % b = " + mod);
        // TODO (3) Get the same result without using the modulo operator

        temp = a;
        while (temp >= b) {
            temp -= b;
        }
        System.out.println("a % b = " + temp);
    }
}
