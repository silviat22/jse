/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12.ex;

import java.util.Arrays;

/**
 * Control flow - Loop: for
 */
public class Exercise2 {
    /**
     * Swap the values in the defined flags array using a for loop and then print it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean[] flags = { true, false, false };
        System.out.println(Arrays.toString(flags));

        for (int i = 0; i < flags.length; i++) {
            // flags[i] = !flags[i];
            // if (flags[i] == true { si definisce la variabile flags booleana
            if (flags[i]) {
                flags[i] = false;
            } else {
                flags[i] = true;
            }
        }
        System.out.println(Arrays.toString(flags));
    }
}
