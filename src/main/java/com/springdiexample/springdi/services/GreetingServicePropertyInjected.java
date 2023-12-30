package com.springdiexample.springdi.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String greeting() {
        return "Test dependency inject using qualifier!!!";
    }
}
