package com.springdiexample.springdi.controllers;

import com.springdiexample.springdi.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.greeting();
    }

}
