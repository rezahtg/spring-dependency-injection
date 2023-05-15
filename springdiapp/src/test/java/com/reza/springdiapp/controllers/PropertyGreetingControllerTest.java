package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.GreetingServiceImpl;
import com.reza.springdiapp.services.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyGreetingControllerTest {

    PropertyGreetingController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyGreetingController();
        controller.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}