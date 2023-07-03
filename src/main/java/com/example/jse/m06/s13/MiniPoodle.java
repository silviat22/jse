package com.example.jse.m06.s13;

public class MiniPoodle extends Poodle {

    public MiniPoodle(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("This is a MiniPoodle");
    }
}
