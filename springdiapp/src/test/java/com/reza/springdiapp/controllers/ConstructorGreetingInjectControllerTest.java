package com.reza.springdiapp.controllers;

import com.reza.springdiapp.services.ConstructorGreetingService;
import com.reza.springdiapp.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorGreetingInjectControllerTest {

    ConstructorGreetingInjectController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorGreetingInjectController(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}