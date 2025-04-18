package com.forceequals.api.controller;

import com.forceequals.api.model.Account;
import com.forceequals.api.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }

    @PostMapping("/accounts/{id}/status")
    public Map<String, String> updateStatus(@PathVariable Long id, @RequestBody Map<String, String> body) {
        boolean updated = accountService.updateStatus(id, body.get("status"));
        Map<String, String> response = new HashMap<>();
        if (updated) {
            response.put("message", "Status updated");
        } else {
            response.put("message", "Account not found");
        }
        return response;
    }
}