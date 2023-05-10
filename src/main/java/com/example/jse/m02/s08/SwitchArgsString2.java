/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s08;

/**
 * Control flow - Decision: switch on String
 */
public class SwitchArgsString2 {
    /**
     * Accordingly to the argument, a different feedback is generated
     * 
     * @param args a single argument is expected
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me a string!");
            return; // si sarebbe potuto scrivere else per continuare il codice
        }

        if (args[0].equals("ciao")) {
            System.out.println("Hello to you!");
        } else if (args[0].equals("Tom")) {
            System.out.println("Welcome back, Tom!");
        } else {
            System.out.println("I don't understand");
        }

        System.out.println("Bye");
    }
}
