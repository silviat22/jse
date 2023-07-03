/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class ArrayListExample {
    /**
     * A few methods from ArrayList
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<Integer>(); //tra <> il tipo (Integer...)di classe, ma basta scriverlo a sx dell'uguale, tra le parentesi tonde il costruttore. List (Liskov): viene sopra, classe madre (interfaccia in realtà) di ArrayList
        recap("An empty list", list0); // recap: la lista è vuota, passo 0//se non vogliamo + AL, basta cambiare List, "programmare per interfacce", la variabile di tipo onterfaccia, l'oggetto definito dal tipo

        List<Integer> list1 = new ArrayList<Integer>(5);//5 è la capacity (nel costruttore)
        recap("An empty list w/ given (5) capacity", list1);

        // adding an element in the last position
        list1.add(56);
        // adding an element in the first position
        list1.add(0, 18); //0 è l'indice, 18 è il valore che vogliamo allocare lì
        list1.add(42);
        recap("After adding elements", list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);//overload del costruttore diverso, copia elementi di list1 + reference, solo elementi, non capaciry (Copy Constructor)
        recap("A list by copy constructor", list2);// sono reference immutabili che si compprtano come primitii

        Integer value = list2.get(0);//prendi elemento pos 0
        System.out.println("Value at the beginning: " + value);

        // calculate the index of the last element
        int lastPos = list2.size() - 1;//size: dimensione (reale) collection
        // change its value
        list2.set(lastPos, 11);//nella list1 rimane il 42, nella list2 ci andrà 11

        // removing the element in second position
        list2.remove(1);

        recap("After changing the last element and removing the middle one", list2);
    }

    /**
     * Utility method to print some information on a list
     */
    private static void recap(String message, List<?> lst) { //? = non so il tipo della lista; alternativa: List <Object>
        System.out.printf("%s: %s, current size %d%n", message, lst, lst.size());
    }
}
