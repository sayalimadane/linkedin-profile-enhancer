package com.forceequals.api.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean authenticate(String username, String password) {
        return "user1".equals(username) && "pass123".equals(password);
    }

    public String generateToken() {
        return "xyz";
    }
}