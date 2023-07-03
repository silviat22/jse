package com.example.jse.m10.s05.esercizio0;

import java.util.ArrayDeque;

public class Esercizio {
    public static void main(String[] args) {
        String s = "Ciao a tutti!";
        ArrayDeque<Character> buffer = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            buffer.push(s.charAt(i));
        }
        System.out.println(buffer);
        while (buffer.size() > 0) {
            // System.out.println(buffer.pop()); //pop: rimuovere elemento che c'è in cima allo stack
            buffer.pop();
            System.out.println(buffer);
        }
    }

}
