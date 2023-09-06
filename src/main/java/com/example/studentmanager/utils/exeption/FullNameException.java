package com.example.studentmanager.utils.exeption;


import com.example.studentmanager.utils.constant.ExceptionMessage;

public class FullNameException extends RuntimeException{
    public FullNameException() {
        super(ExceptionMessage.FULL_NAME.getMessage());
    }
}
