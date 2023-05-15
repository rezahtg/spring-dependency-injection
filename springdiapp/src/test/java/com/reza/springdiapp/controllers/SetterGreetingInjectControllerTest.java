package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.GreetingService;
import com.reza.springdiapp.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterGreetingInjectControllerTest {

    SetterGreetingInjectController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterGreetingInjectController();
        controller.setGreetingService(new SetterGreetingService());

     }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}