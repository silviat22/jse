package com.example.jse.m06.s02.esempio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(100), new Pitbull(90), new Husky(80), new Labrador(70), new Dog(20) };
        System.out.println(Arrays.toString(dogs));

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark(); // stampa sono un pitbull ecc perchè nella classi dei cani abbiamo fatto
                            // l'override del metodo bark che stampava "sono un..."
        }

        f(dogs[dogs.length - 1]); // per far abbaiare basta invocare metodo f in cui c'è il metodo bark

    }

    public static void f(Dog dog) { // quando si invoca il metodo f passando un cane, lui abbaierà, dog qui è il parametro
        dog.setFrequency(Dog.HIGHEST_FREQUENCY);
        if (dog.getFrequency() <= 90) {
            // dog.frequency = 91; // a causa del protected, abbiamo modificato un parametro
            // di Labrador, col getter questo comando non va + bene
            System.out.println("Questo cane non abbaia");
        }
        // if (dog.getFrequency() > 90) {
        else {
            dog.bark();
        }
    }
}
