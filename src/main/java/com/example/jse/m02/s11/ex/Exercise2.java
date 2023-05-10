/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

import java.util.Arrays;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise2 {
    /**
     * Swap the values in the defined flags array two times, and print it each time:
     * <li>By while loop
     * <li>By do-while loop almeno un elemento
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean[] flags = { true, false, false };
        System.out.println(Arrays.toString(flags));

        int i = 0;
        while (i < flags.length) {
            if (flags[i] == true) {
                flags[i] = false;
            } else {
                flags[i] = true;
            }
            i++;
        }
        System.out.println(Arrays.toString(flags));

        i = 0;

        do {
            if (flags[i] == true) {
                flags[i] = false;
            } else {
                flags[i] = true;
            }
            i++;
        } while (i < flags.length);
    }
}