package com.malik.welcomeapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

@GetMapping("/")
public String home() {
    return "Welcome to Malik's App! I am Malik Mullar, a young developer.";
}
@GetMapping("/about")
public String about() {
    return "I am Malik Mullar, a young developer passionate about building software.";
}
@GetMapping("/skills")
public String skills() {
    return "My skills: Java, Python, HTML, CSS";
}
}
