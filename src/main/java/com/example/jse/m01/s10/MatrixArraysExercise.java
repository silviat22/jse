/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s10;

import java.util.Arrays;

/**
 * Exercise on two-dimensional array
 */
public class MatrixArraysExercise {
    /**
     * <ol>
     * <li>Create a two line matrix
     * <ul>
     * <li>Row 1: "ciao", "buongiorno"
     * <li>Row 2: "hello", "good morning"
     * </ul>
     * <li>Print the first English greeting
     * <li>Convert the Italian greetings in a string and print it
     * <li>Convert the full matrix in a string and print it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[][] saluti = { //
                {"ciao", "buongiorno"}, //
                {"hello", "good morning"} //  
        };
        System.out.println(saluti);
        System.out.println(saluti.length);
        System.out.println(Arrays.deepToString(saluti));
        
        System.out.println(saluti[1][0]);
        
        String [] salutiItaliani = saluti [0];
        String s = Arrays.toString(salutiItaliani);
        System.out.println(s);
        // System.out.println(Arrays.toString(saluti [0]));
        
        System.out.println(Arrays.deepToString(saluti));
        System.out.println("Done");
    }
}
