package com.example.studentmanager.utils.constant;

public enum ExceptionMessage {
    FULL_NAME("FullName must have at least 10 and maximum 50 character"),
    DATE_OF_BIRTH("Date of birth must follow dd-mm-yyyy format"),
    PHONE_NUMBER("Phone number must have 10 number"),
    UNKNOWN_INPUT("Input files have unknown errors !!!")
    ;
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
