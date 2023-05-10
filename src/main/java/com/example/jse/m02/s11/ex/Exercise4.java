/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise4 {
    /**
     * Using while or do-while, print the first elements in args, but not more than
     * three of them.
     * <p>
     * For example:
     * <li>["ciao", "hello"] -> "ciao" "hello"
     * <li>["ciao", "hello", "ciao", "hello"] -> "ciao" "hello" "ciao"
     * 
     * @param args The caller could pass us 0 ... n arguments
     */
    public static void main(String[] args) {
        // System.out.println(args.length - 1);

        // System.out.println(Math.min(args.length, 3));
        int i = 0;
        int end = Math.min(args.length, 3);
        while (i < end) {
            System.out.println(args[i]);
            i++;

//       SBAGLIATO! Perchè io ho ragionato conoscendo la lunghezza + Ho inserito syso done nel loop e l'ha stampato ogni volta +    
//       while (i < args.length - 1) {
//          i++;
//           System.out.println(args[i]);
//           System.out.println("Done");
        }
    }
}
