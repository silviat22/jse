package com.example.jse.m02.s12;

public class ExerciseFor {
    public static void main(String[] args) {
        // tutti i numeri pari da 0 a 9

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        int[] values = { 1, 9, 3, 10, 23 };
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println(values[i]);
            }
        }
    }
}
