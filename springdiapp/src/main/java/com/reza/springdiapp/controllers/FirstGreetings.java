package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FirstGreetings {

    private final GreetingService greetingService;

    public FirstGreetings(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
