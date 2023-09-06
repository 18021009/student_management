package com.example.studentmanager.utils.exeption;


import com.example.studentmanager.utils.constant.ExceptionMessage;

public class UnKnownInputException extends RuntimeException{
    public UnKnownInputException() {
        super(ExceptionMessage.UNKNOWN_INPUT.getMessage());
    }
}
