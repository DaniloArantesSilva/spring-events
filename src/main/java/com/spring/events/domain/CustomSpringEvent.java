package com.spring.events.domain;

public class CustomSpringEvent {

    private String message;


    public CustomSpringEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
