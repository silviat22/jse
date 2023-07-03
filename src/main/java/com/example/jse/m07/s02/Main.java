/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s02;

/**
 * Introduction to exception
 */
public class Main {
    public static void main(String[] args) {
        // Exceptions are expensive, not always used!

        // The error code idiom
        // 1. call the method that could fail
        double input = -15.3; //primitivo
        double result = Math.sqrt(input);
        // 2. check the result
        if (Double.isNaN(result)) { //NotaNumber costante=non è un numero, pur essendo un primitivo è un errore
            // 2a. Error code detected, signal the problem
            System.out.println("Bad input: " + input);
        } else {
            // 2b. No error code, result is good, use it
            System.out.println("Square root is " + result);
        }

        // ... but what if there is no check? 
        System.out.println("Result is " + result);

        // in case of exception, if the caller do not take any further step, the program
        // terminates!

        // The try-catch idiom
        int a = 42;
        int b = 0;
        try {
            // in the try block the code that could throw an exception
            System.out.println(a / b);
        } catch (Exception ex) {
            // java.lang.ArithmeticException: / by zero

            // maybe there is a possible alternative approach

            // maybe we could just tell the user about the issue
            System.out.println("Bad input!");

            // maybe we could re-throw the exception
            // throw ex;

            // maybe we could wrap the original exception and throw again
            // throw new IllegalStateException(ex);

            // maybe we could just terminate the method execution
            // return;
        }

        System.out.println("Done");
    }
}
