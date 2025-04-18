package com.forceequals.api.controller;

import com.forceequals.api.model.User;
import com.forceequals.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        Map<String, String> response = new HashMap<>();
        if (authService.authenticate(user.getUsername(), user.getPassword())) {
            response.put("message", "Login successful");
            response.put("token", authService.generateToken());
        } else {
            response.put("message", "Invalid credentials");
        }
        return response;
    }
}