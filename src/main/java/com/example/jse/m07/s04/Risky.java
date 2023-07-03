/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s04;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.jse.m07.s03.Exceptional;

/**
 * Try-catching exceptions
 */
public class Risky {
    private static final Logger log = Logger.getGlobal();

    /**
     * A method that catches an exception
     */
    public void aCatcher() {
        Exceptional exceptional = new Exceptional();

        // ...
        try {
            exceptional.aCheckedThrower();

            // called only if no exception before
            // exceptional.close();
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Exception caught in f()", ex);

            // called only when an exception occurs
            // exceptional.close();
        } finally {
            // always called
            exceptional.close();
        }
    }

    /**
     * A method that do not catch an exception
     * 
     * @throws Exception thrown by Exceptional::aCheckedThrower()
     */
    public void notACatcher() throws Exception { //invoca aCheckedThrower ma non fa try-catch per cui ci pensi chi mi ha chiamato
        Exceptional exceptional = new Exceptional();

        // ...
        exceptional.aCheckedThrower();

        // when the method above throws an exception, the following code is ignored
        log.info("This statement won't be reached");
        // ERROR! resource leak!
        exceptional.close();
    }

    /**
     * Smoke test for try-catch example
     * 
     * @param args not used
     * @throws Exception let the program terminate printing the stack trace
     */
    public static void main(String[] args) throws Exception {
        Risky risky = new Risky();
        Exceptional exceptional = new Exceptional();

        log.info("I'm about to call aCatcher(), it won't throw exceptions");
        risky.aCatcher();

        log.info("Calling Exceptional.aCheckedThrower() could be dangerous");
        try {
            exceptional.aCheckedThrower();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Something went wrong", e);
        }

        log.info("Final call to Exceptional.aCheckedThrower(), exception passed on to JVM");
        // try-finally, the exception is not caught!
        try {
            exceptional.aCheckedThrower();
        } finally { //non c'è catch, quindi l'eccezionbe non viene gestita, il programma terminerà
            System.out.println("done call to Exceptional.aCheckedThrower()");
            exceptional.close();
        }

        log.info("This statement won't be reached"); //non viene eseguito per il finally che fa terminare tutto
    }
}
