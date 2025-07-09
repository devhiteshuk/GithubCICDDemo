package com.dev.uk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the application!";
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