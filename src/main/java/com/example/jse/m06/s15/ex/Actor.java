/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
    private String name;
    private int experience;
    private boolean alive;

    /**
     * Canonical constructor
     * 
     * @param name the actor name
     */
    protected Actor(String name, int experience) { // astratta, base gerarchia, mi aspetto classi figlie
        this.name = name;
        this.experience = experience;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    // getter; anzichè getAlive è isAlive perchè è un booleano
    public boolean isAlive() {
        return alive;
    }

//setter, mi permette di vedere il campo ma anche di modificarlo
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Actor [name=" + name + ", experience=" + experience + "]";
    }

    /**
     * Fight against an enemy
     * 
     * @param enemy another actor
     * @return true if the current actor wins
     */
    public abstract boolean fight(Actor enemy);
}
