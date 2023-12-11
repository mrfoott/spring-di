package com.springdiexample.springdi.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Test dependency injection without Spring!!!";
    }
}
