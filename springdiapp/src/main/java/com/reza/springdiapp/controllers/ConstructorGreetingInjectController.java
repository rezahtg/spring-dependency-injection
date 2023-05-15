package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingInjectController {

    private final GreetingService greetingService;

    public ConstructorGreetingInjectController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreetings();
    }
}
