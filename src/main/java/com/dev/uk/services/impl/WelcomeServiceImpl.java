package com.dev.uk.services.impl;

import com.dev.uk.services.WelcomeService;
import org.springframework.context.annotation.Primary;

@Primary
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the application!";
    }
}
