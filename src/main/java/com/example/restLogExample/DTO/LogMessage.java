package com.example.restLogExample.DTO;

public class LogMessage {

    private String message;

    public LogMessage() {

    }

    public LogMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
