package com.reza.springdiapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello world!!!");
        return "this is sample inversion controls";
    }

}
