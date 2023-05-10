package com.example.jse.m05.s03.my;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void steerLeft() { // verifica che se l'input è true, il valore atteso è quello che effettivamente
                       // mi genera il mio metodo (actual)
        Car car = new Car("", "");
        boolean input = true; // risulta true invocando il metodo steer
        String expected = "Ho sterzato a...sinistra";
        String actual = car.steer(input);
        assertEquals(expected, actual);

    }

    void steerRight() {
        Car car = new Car("", "");
        boolean input = false;
        String expected = "Ho sterzato a...destra";
        String actual = car.steer(input);
        assertEquals(expected, actual);
    }

}
