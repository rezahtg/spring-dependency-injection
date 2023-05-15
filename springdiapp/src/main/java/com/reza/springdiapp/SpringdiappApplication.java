package com.reza.springdiapp;

import com.reza.springdiapp.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdiappApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("--------");
		FirstGreetings firstGreetings = (FirstGreetings) ctx.getBean("firstGreetings");
		System.out.println(firstGreetings.sayHello());
		System.out.println("_____Property Injected Call");
		PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean(
				"propertyGreetingController");
		System.out.println(propertyGreetingController.getGreeting());
		System.out.println("_____Setter Injected Call");
		SetterGreetingInjectController setterGreetingInjectController = (SetterGreetingInjectController) ctx.getBean(
				"setterGreetingInjectController");
		System.out.println(setterGreetingInjectController.sayHello());
		System.out.println("_____Constructor Injected Call");
		ConstructorGreetingInjectController constructorGreetingInjectController =
				(ConstructorGreetingInjectController) ctx.getBean("constructorGreetingInjectController");
		System.out.println(constructorGreetingInjectController.getGreeting());
	}

}
