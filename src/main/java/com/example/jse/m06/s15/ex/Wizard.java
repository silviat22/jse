package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Wizard extends Actor {

    private static final Logger log = Logger.getGlobal();

    protected Wizard(String name, int experience) {
        super(name, experience);
    }

//    @Override
//    public boolean fight(Actor enemy) {
//        if (!(enemy instanceof Wizard)) { // se enemy è un guerriero, vince mago
//            log.info(enemy + " won");
//            return true;
//        }
//        if (this.getExperience() > enemy.getExperience()) {
//            System.out.println(getName() + " wins against " + enemy.getName());
//            return true;
//        }
//        return false;
//    }

    public boolean fight(Actor enemy) { // se enemy è mago e l'esperienza è più grande della nostra
        if (enemy instanceof Wizard && enemy.getExperience() > this.getExperience()) {
            log.info(enemy.getName() + " won");
            this.setAlive(false); // la strega corrente muore
            return false;
        }
        log.info(getName() + " won");
        enemy.setAlive(false);
        return true;
    }

    @Override
    public String toString() {
        return "Wizard si chiama " + getName() + " e ha skill " + getExperience();
    }
//    //@Override
//    public String toString() { //per dire se sono vivi o morti
//        return String.format ("Wizard(%b) %s" , this.isAlive(), this.getName() + ";

}
