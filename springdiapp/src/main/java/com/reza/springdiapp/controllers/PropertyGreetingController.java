package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyGreetingController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayGreetings();
    }

}
