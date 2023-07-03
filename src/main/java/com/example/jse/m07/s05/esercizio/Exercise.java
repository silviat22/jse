package com.example.jse.m07.s05.esercizio;

public class Exercise { // trovare il massimo
    public static int max(int[] numbers) throws MaxException {
        if (numbers == null || numbers.length == 0) {
            // throw new IllegalArgumentException("Numbers deve essere un array non vuoto");
            throw new MaxException("Numbers deve essere un array non vuoto");
        }
        int temp = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > temp) {
                temp = numbers[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) { // try catch nel main
        try {
            int[] numbers = { 1, 2, 3 };
            int x = Exercise.max(numbers);
            System.out.println(x);
        } catch (Exception e) {//richiama la classe madre EXception, estesa da MaxException(altra classe)
            System.out.println(e); // si può mettere anche il log
        }
    }
}
