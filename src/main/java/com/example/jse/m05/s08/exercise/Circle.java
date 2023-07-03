/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s08.exercise;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Circle { //non creare l'oggetto  di nuovo, già creato in MAIN. Qui si lavoa sull'oggetto

    private double radius; //non public Circle(int radius), va bene ma non è il + corretto

    /**
     * Constructor
     * 
     * @param radius the circle radius
     */
    public Circle(double radius) {

        this.radius = radius;
    }

    /**
     * The circle area is π * radius ^ 2
     * 
     * @return the circle area
     */
    public double area() {
        // throw new UnsupportedOperationException("Not yet implemented");
        return radius * radius * Math.PI; // Math.pow(radius, 2) * Math.PI;
    }

    /**
     * The circle area is 2 * π * radius
     * 
     * @return the circle perimeter
     */
    public double perimeter() {
        // throw new UnsupportedOperationException("Not yet implemented");
        return 2 * Math.PI * radius;
    }
}
