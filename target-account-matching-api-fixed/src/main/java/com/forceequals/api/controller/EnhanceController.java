package com.forceequals.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Allow frontend access
public class EnhanceController {

    @PostMapping("/enhance-profile")
    public ResponseEntity<Map<String, String>> enhanceProfile(@RequestBody Map<String, String> request) {
        String input = request.getOrDefault("headline", "Software Developer");
        String enhanced = "🔥 " + input + " | Open to Opportunities";

        return ResponseEntity.ok(Map.of("enhancedHeadline", enhanced));
    }
}
