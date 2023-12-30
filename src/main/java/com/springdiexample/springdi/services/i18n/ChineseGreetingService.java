package com.springdiexample.springdi.services.i18n;

import com.springdiexample.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile("CN")
public class ChineseGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Nihao mama - CN";
    }
}
