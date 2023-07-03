package com.example.jse.m06.s02.esempio;

public class Dog {
    public static final int LOWEST_FREQUENCY = 50;
    public static final int HIGHEST_FREQUENCY = 200;
    public static final int DEFAULT_FREQUENCY = 100;
    private int frequency;

    public Dog(int frequency) {
        setFrequency(frequency);
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        if (frequency >= LOWEST_FREQUENCY && frequency <= HIGHEST_FREQUENCY) {
            this.frequency = frequency;
        } else {
            this.frequency = DEFAULT_FREQUENCY;
        }

    }

    public void bark() {
        System.out.println("Sono un cane " + frequency);
    }

    @Override
    public String toString() {
        return "Dog [frequency=" + frequency + "]";
    }

}
