/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15;

/**
 * Reference casting example
 */
public class Main {
    /**
     * Working with objects in a hierarchy
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a cat is a pet is a brushable
        Brushable kim = new Cat("Kim");
        kim.brush(); // brush unico metodo che non ha a che fare con Object, perchè kim è una
                     // varibile di tipo Brushable che è un'interfaccia

        // let kim barks, but only if it is a dog
        if (kim instanceof Dog) {
            // downcast protected by instanceof
            Dog dog = (Dog) kim;
            dog.bark();
        }

        // Crosscast forbidden, won't compile: Cannot cast from Dog to Cat
//        Cat cat = (Cat) new Dog(); //cane e gatto sono nella stessa gerarchia ma non uno sopra e uno sotto (seguendo l'albero)

        // Upcast always good (Liskov)
        Pet pet = new Dog("Bob"); // mi aspetto di avere reference a Pet, Dog is-a Pet quindi va bene

        // Right downcast (but risky, DO NOT DO THIS IN PRODUCTION CODE!)
        Dog dog = (Dog) pet;
        dog.bark();

        // WRONG downcast! leads to a ClassCastException at runtime
//        Cat cat = (Cat) pet;
        // next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

        // Always protect your downcast with instanceof
        if (pet instanceof Cat) {
            Cat tom = (Cat) pet;
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }

        // An array of pet could contain reference to any subclass
        Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

        for (int i = 0; i < pets.length; i++) {
            pets[i].brush();
        }

        f(pets);
        g(pets);
    }

    /**
     * Let each pet make its noise - using downcast
     * 
     * @param pets a few pets
     */
    static void f(Pet[] pets) {
        if (pets == null) {
            return;
        }

        System.out.println("Let each pet bark or meow ...");
        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets[i]; // variabile di looè pets
            if (pet instanceof Dog) { // se l'animale corrente è un cane, fallo abbaiare
                Dog dog = (Dog) pet; //castare pet in dog
                dog.bark();
            } else if (pet instanceof Cat) { // altrimenti se è un gatto, fallo miagolare
                Cat cat = (Cat) pet; // castare pet in cat
                cat.meow();
            }
        }
//        for (Pet pet : pets) { 
//            if (pet instanceof Dog) {
//                Dog dog = (Dog) pet;
//                dog.bark();
//            } else if (pet instanceof Cat) {
//                ((Cat) pet).meow();
//            }
//        }
    }

    /**
     * Let each pet make its noise - using polymorphism
     * 
     * @param pets a few pets
     */
    static void g(Pet[] pets) {
        if (pets == null) {
            return;
        }

        System.out.println("Let each pet make its noise  ...");
        for (Pet pet : pets) {
            pet.makeNoise();
        }

    }

//    public static void prova() {
//        Object tom = new Cat("Tom");
//        if (tom instanceof Cat) {
//            Cat bob = (Cat) tom;
//        }
//    }
}
