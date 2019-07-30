package com.company;

public class IllegalAgeException extends RuntimeException { // непроверяемые исключения
    public IllegalAgeException(String message) {
        super(message);
    }
}
