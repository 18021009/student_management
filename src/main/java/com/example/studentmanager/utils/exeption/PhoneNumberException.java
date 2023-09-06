package com.example.studentmanager.utils.exeption;


import com.example.studentmanager.utils.constant.ExceptionMessage;

public class PhoneNumberException extends RuntimeException{
    public PhoneNumberException() {
        super(ExceptionMessage.PHONE_NUMBER.getMessage());
    }
}
