package com.spring.events.listener;

import com.spring.events.domain.CustomSpringEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListenerTwo {

    @Async
    @EventListener
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println("Received spring custom event 2 - " + event.getMessage());
    }

}
