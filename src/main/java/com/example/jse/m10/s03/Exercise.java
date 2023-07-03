/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Three exercises. Compare int[] and List&lt;Integer&gt; behavior
 */
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();// per poterlo usare a riga 17
        int[] array = { 1, 2, 3, 4, 5 };
        int[] result = exercise.evensRaw(array);
        System.out.println(Arrays.toString(result));
        // inizializzare la lista, List.of (static factory method) crea un oggetto
        // immutabile(con new Array l'ogg lista sarebbe stato
        // mutabile)
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 5, 7);
        List<Integer> x = exercise.evens(list);// passo la lista al metodo evens,che ritornerà lista solo pari
        System.out.println(x); // le liste sanno come trasformarsi in stringa, basta inserire il reference (x)

        List<Integer> y = exercise.singles(list);
        System.out.println(y);

    }

    /**
     * Extract from input the even values and return them in an array
     * <p>
     * Examples:
     * <li>in {9, 2, 3, 4} -> out {2, 4}
     * <li>in {6, 2, 4, 2} -> out {2, 2, 4, 6}
     * <li>in {2, 3, 4, 6} -> out {2, 4, 6}
     * 
     * Do not use Collections in here!
     * 
     * @param data a bunch of integers
     * @return even values from input
     */
    // si potevano creare 2 array, in cui copiare elementi pari altri array
    public int[] evensRaw(int[] data) {
        int len = 0; // lunghezza array result
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                len++;
            }
        }
        int[] result = new int[len]; // creazione array col new, result è lungo come data
        for (int i = 0, j = 0; i < data.length; i++) {// j è lungo come data
            if (data[i] % 2 == 0) {
                result[j] = data[i];// risulta [0, 2, 0, 4, 0] perché gli 0 sono al posto dei numeri pari
                j++;// ora risulta [2, 4, 0, 0, 0]
            }
        }
        return result;

    }

    /**
     * Extract from input the even values and return them
     * <p>
     * Example: in {2, 3, 4, 5} -> out {2, 4}
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     */
    public List<Integer> evens(List<Integer> data) {// data in questo caso è un parametro: List chiamante, data
                                                    // chiamato, all'interno c'è un reference, entrambi indirizzano lo
                                                    // stesso oggetto (passaggio by value)
        List<Integer> result = new ArrayList<>();

//        for (int i = 0; i < data.size(); i++) { // size è un metodo, ()
//            Integer cur = data.get(i);
//            if (cur % 2 == 0) {// se il valore nella posizione i-esima
//                result.add(cur);
//            }
//        }
        for (Integer cur : data) {
            if (cur % 2 == 0) {
                result.add(cur);
            }
        }
        return result;
    }

    /**
     * Extract non-duplicated values in input and return them in a list.
     * <p>
     * Example: in {5, 4, 2, 3, 7, 4, 5, 6} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public List<Integer> singles(List<Integer> data) {
        // throw new UnsupportedOperationException("Not yet implemented");
        List<Integer> result = new ArrayList<>();

        for (Integer cur : data) {
            if (count(data, cur) == 1) {
                result.add(cur);
            }
        }
        return result;
    }

    private int count(List<Integer> data, Integer target) {
        int count = 0;

        for (Integer cur : data) {
            if (cur.equals(target)) {
                count++;
            }

        }
        return count;

    }
}
