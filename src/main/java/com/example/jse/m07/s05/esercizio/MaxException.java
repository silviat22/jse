package com.example.jse.m07.s05.esercizio;

@SuppressWarnings("serial")
public class MaxException extends Exception{ //eccezione creata da noi (MaxE)

    public MaxException() {
        super();
        
    }

    public MaxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
       
    }

    public MaxException(String message, Throwable cause) {
        super(message, cause);
        
    }

    public MaxException(String message) { //spesso basta solo questo Costruttore, serve per creare l'oggetto messaggio dell'eccezione
        super(message);
        
    }

    public MaxException(Throwable cause) {
        super(cause);
        
    }

   

}
