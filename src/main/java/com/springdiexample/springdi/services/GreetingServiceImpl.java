package com.springdiexample.springdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Test dependency injection !!!";
    }
}
