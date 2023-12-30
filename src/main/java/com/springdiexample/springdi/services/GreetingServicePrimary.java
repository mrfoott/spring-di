package com.springdiexample.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String greeting() {
        return "Hello from primary Bean!!!";
    }
}
