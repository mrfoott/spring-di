package com.springdiexample.springdi.controllers;

import com.springdiexample.springdi.services.GreetingService;
import com.springdiexample.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hiMom() {
        System.out.println("Now I'm in My Controller!!!");

//        return "Hi mom!!!";
        return greetingService.greeting();
    }

}
