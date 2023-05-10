/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12.ex;

/**
 * Control flow - Loop: for / for-each
 */
public class Exercise3 {
    /**
     * Using for or for-each, print all passed argument
     * 
     * @param args each argument is going to be printed
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        for (String cur : args) {
            System.out.println(cur);
        }
    }
}
