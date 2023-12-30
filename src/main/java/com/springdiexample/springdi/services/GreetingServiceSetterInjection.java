package com.springdiexample.springdi.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String greeting() {
        return "Hey I'm setting a greeting from GreetingServiceSetter!!!";
    }
}
