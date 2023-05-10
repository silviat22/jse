/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s09;

/**
 * Defining and using an array with the shortcut initialization
 */
public class ArrayShortcut {
    public static void main(String[] args) {
        // Array with length 3, each element is initialized as described
        int[] data = { 1, 4, 13 };

        System.out.print("First element is ");
        System.out.println(data[0]);

        System.out.print("Last element is ");
        System.out.println(data[data.length - 1]);

        // !!! be careful with indices !!!
//        data[data.length] = 21; // WRONG! exception!
        // ERRORE, MANCA IL - 1 data[data.length] = 21;
        data[data.length - 1] = 21;

        System.out.print("The last element is ");
        System.out.println(data[data.length - 1]);

        System.out.print("The length is ");
        System.out.println(data.length);
    }
}
