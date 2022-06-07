package com.spring.events.controller;

import com.spring.events.publisher.CustomSpringEventPublisher;
import com.spring.events.publisher.GenericSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class CustomSpringEventController {

    @Autowired
    private CustomSpringEventPublisher publisher;

    @Autowired
    private GenericSpringEventPublisher publisherGeneric;

    @PostMapping
    public void publishEvent(@RequestBody String message) {
        System.out.println("start");
        publisher.publishCustomEvent(message);
        System.out.println("end");
    }

    @PostMapping("/generics")
    public void publishGenericEvent(@RequestBody String message) {
        System.out.println("start");
        publisherGeneric.publishGenericEvent(message);
        System.out.println("end");
    }

}
