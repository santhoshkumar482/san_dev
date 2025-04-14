package com.example.maven_project.controller;

import com.example.maven_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        boolean isValid = userService.validateLogin(email, password);
        return isValid ? "Login successful" : "Invalid credentials";
    }
}
