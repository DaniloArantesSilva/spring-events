package com.spring.events.publisher;

import com.spring.events.domain.GenericSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishGenericEvent(final String message) {
        System.out.println("Publishing custom event. ");
        GenericSpringEvent customSpringEvent = new GenericSpringEvent(message, true);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

}
