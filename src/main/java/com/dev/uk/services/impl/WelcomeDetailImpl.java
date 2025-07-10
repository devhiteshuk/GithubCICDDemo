package com.dev.uk.services.impl;

import com.dev.uk.services.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeDetailImpl implements WelcomeService {
    @Override
    public String getWelcomeMessage() {
        return "Welcome Detail Impl: Welcome to the application with additional details!";
    }
}
