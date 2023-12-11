package com.springdiexample.springdi.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void hiMom() {

        MyController myController = new MyController();

        System.out.println(myController.hiMom());
    }
}