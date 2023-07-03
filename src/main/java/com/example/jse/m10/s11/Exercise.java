/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap exercise
 */
public class Exercise {
    /**
     * Extract non-duplicated values in input and return them as a Collection, for
     * example:
     * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public Collection<Integer> singles(int[] data) {
        Map<Integer, Integer> map = new HashMap<>(); // Key elemento(valore) in data, Value contatore (quante volte trovo il
                                                     // valore)
        for (int i = 0; i < data.length; i++) {
            int cur = data[i]; // i indice, cur valore
            Integer count = map.get(cur);
            //si poteva usare map.putIfAbsent(cur, 1); che in questo caso dà null ma solitamente fi put, inserisci elem solo se non c'è
            //map.getOrDefault(cur, 1); vedi se c'è elem nella mappa, ritorna quante volte c'è
            if (count == null) { // se l'elemento non è nella mappa
                map.put(cur, 1);// inseriamolo nella map
            } else {
                map.put(cur, count + 1);
            }
        }
        Collection<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // loopare su tutti gli entry (coppia chiave
                                                                   // valore),prendere il set fatto
                                                                   // da tutti gli entry. (classe Map.Entry)
            if (entry.getValue() == 1) {
                result.add(entry.getKey());//
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Collection<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }
}
