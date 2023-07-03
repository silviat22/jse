/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * HashSet exercise
 */
public class Exercise {
    /**
     * Given an integer collection, return another collection without any duplicate
     * value
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data a collection, possibly with duplicates
     * @return the original data stripped of duplicates
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(12, 53, 12, 35);
        Exercise exercise = new Exercise();

        Collection<Integer> collection = exercise.singles(list);
        System.out.println(collection);
    }

    private Collection<Integer> singles(Collection<Integer> data) {
        // return new HashSet<>(data); //la hashset in automatico scarta i duplicati,
        // performace O(n)
        return new TreeSet<>(data);//sistema la serie senza duplicati ma in ordine
    }
}
