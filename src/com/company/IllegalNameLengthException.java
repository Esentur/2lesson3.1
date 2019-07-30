package com.company;

public class IllegalNameLengthException extends Exception { //проверяемые исключения

    public IllegalNameLengthException(String message) {
        super(message);
    }
}
