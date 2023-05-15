package com.reza.springdiapp.services;


import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Hello World! - Setter Greeting";
    }
}
