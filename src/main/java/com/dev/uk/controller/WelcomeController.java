package com.dev.uk.controller;

import com.dev.uk.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeService.getWelcomeMessage();
    }
}

/**
 * git init
 * git add README.md
 * git commit -m "first commit"
 * git branch -M main
 * git remote add origin https://github.com/devhiteshuk/GithubCICDDemo.git
 * git push -u origin main
 */