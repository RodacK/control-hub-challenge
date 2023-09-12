package com.controlhub.exceptions;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class FibonacciException extends RuntimeException {
    public FibonacciException(String message){super(message);}

    public FibonacciException(String message, Throwable cause){super(message,cause);}

    public FibonacciException(String message, Throwable cause, String parameter){
        super(String.format(message,parameter),cause);
    }

    public FibonacciException(String message, String parameter){
        super(String.format(message,parameter));
    }
}
