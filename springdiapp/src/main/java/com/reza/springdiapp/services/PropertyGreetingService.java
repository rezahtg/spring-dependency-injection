package com.reza.springdiapp.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World! - Property Greeting DI";
    }
}
