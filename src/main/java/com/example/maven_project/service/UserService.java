package com.example.maven_project.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    // In-memory user store (email -> password)
    private Map<String, String> users = new HashMap<>();

    public UserService() {
        // Add hardcoded users
        users.put("test@example.com", "123456");
        users.put("admin@example.com", "admin123");
    }

    public boolean validateLogin(String email, String password) {
        return users.containsKey(email) && users.get(email).equals(password);
    }
}
