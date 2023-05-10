package com.example.jse.m05.s03.my;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fiat", "Panda");
        System.out.println(car);
        String message = car.steer(true);
        System.out.println(message);
    }

}
