/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m09.s08;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * File input by Scanner
 */
public class Adder {
    private static final Logger log = Logger.getGlobal();

    /**
     * Scanner
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0.0;
//Ctrl Z per concludere l'esecuzione di Scanner
        Scanner scanner = new Scanner(System.in);// syin è la tastiera, reference a un oggetto, l'oggetto è la tastiera
        while (scanner.hasNext()) { // hasNext ritorna un booleano (true se lo scanner ha un token da leggere); il loop si blocca finchè l'utente non pigia qualcosa sulla tastiera e dà invio, quando ci sarà qualcosa da legger,e inizia loop
            if (scanner.hasNextDouble()) { // il token(la stringa che mi è arrivata) (che c'è dentro scanner) è reale(double)? Converte il token come double
                result += scanner.nextDouble(); //aggiungo al risultato il valore double (che è dentro scanner) convertito in double 
                log.info("Current result is " + result);
            } else {
                System.out.println("Bad input, discarded: " + scanner.next()); //next significa che tutto quello che l'utente passa, viene letto e nel caso scartato
            }
        }
        scanner.close();
        System.out.println("Total is " + result);
    }
}
//entriamo, ci attacchiamo alla tastoera, chiediamo se ci sono dei dtai (hasnext), facciamo la lettura del dato double, solo a questo punto che leggiamo coem dato, altrimenti non lo leggo