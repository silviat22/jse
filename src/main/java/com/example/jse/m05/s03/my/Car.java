package com.example.jse.m05.s03.my;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        // super();
        this.brand = brand;
        this.model = model;
    }

    @Override // ridefinire un metodo
    public String toString() {
        return "Car [brand = " + brand + ", model = " + model + "]";
    }

    public String steer(boolean left) { // (String left, String right) {
        String direzione;
        if (left) {
            direzione = "sinistra";
        } else {
            direzione = "destra";
        }
        return "Ho sterzato a..." + direzione;
    }

}