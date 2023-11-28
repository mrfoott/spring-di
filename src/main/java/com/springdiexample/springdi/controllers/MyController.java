package com.springdiexample.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hiMom() {
        System.out.println("Now I'm in My Controller!!!");

        return "Hi mom!!!";
    }

}
