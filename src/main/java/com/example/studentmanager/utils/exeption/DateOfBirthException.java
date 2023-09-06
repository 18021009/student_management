package com.example.studentmanager.utils.exeption;


import com.example.studentmanager.utils.constant.ExceptionMessage;

public class DateOfBirthException extends RuntimeException{
    public DateOfBirthException() {
        super(ExceptionMessage.DATE_OF_BIRTH.getMessage());
    }
}
