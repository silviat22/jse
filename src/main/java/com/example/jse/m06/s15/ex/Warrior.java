package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Warrior extends Actor {
    private static final Logger log = Logger.getGlobal();

    protected Warrior(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean fight(Actor enemy) {
        if (enemy instanceof Wizard) { // se enemy è un guerriero, perde
            log.info(enemy + " lost");
          this.setAlive(false);
            return false;
        }
        if (this.getExperience() > enemy.getExperience()) {
            System.out.println(getName() + " wins against " + enemy.getName());
            enemy.setAlive(false);
            return true;
        }
        this.setAlive(false);
        return false;
    }

    @Override
    public String toString() {
        return "Warrior si chiama " + getName() + " e ha skill " + getExperience();
    }
  //@Override
//  public String toString() { //per dire se sono vivi o morti
//      return String.format ("Warrior(%b) %s" , this.isAlive(), this.getName();
}
