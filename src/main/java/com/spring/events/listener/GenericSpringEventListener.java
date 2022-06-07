package com.spring.events.listener;

import com.spring.events.domain.GenericSpringEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventListener<T> {

    @Async
    @EventListener
    public void handleSuccessful(GenericSpringEvent<T> event) {
        System.out.println("Handling generic event (conditional). - " + event.getWhat() + " " + event.isSuccess());
    }

}
