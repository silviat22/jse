/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
    /**
     * See requests in the "to do" comments
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Car car = new Car(); // Vehicle car = new Car();
        Bus bus = new Bus();
        MotorBike motorBike = new MotorBike();
        Vehicle[] vehicles = { car, motorBike, bus };

        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions

        // car.steer(true); // per far sterzare l'auto
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < vehicles.length; i++) {
                if (i % 2 == 0) {
                    vehicles[i].steer(true);
                } else {
                    vehicles[i].steer(false);
                }
            }
        }

//         //PERCHè NON FUNZIONA? char buffer ecc
//        for (int j = 0; j < vehicles.length; j++) {
//            System.out.println(Vehicle.toString);
//        }

        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditionings = { car, bus, new Flat() };
        System.out.println(Arrays.toString(conditionings));

        // TODO: (4) set the temperature of each conditioned to 20
        for (int i = 0; i < conditionings.length; i++) {
            conditionings[i].tempCond(20);
        }
    }
}
