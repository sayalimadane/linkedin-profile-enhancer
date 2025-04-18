package com.forceequals.api.service;

import com.forceequals.api.model.Account;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountService {
    private final Map<Long, Account> accounts = new HashMap<>();

    public AccountService() {
        accounts.put(1L, new Account(1L, "TechCorp", 86, "Target"));
        accounts.put(2L, new Account(2L, "InnovateX", 72, "Not Target"));
        accounts.put(3L, new Account(3L, "FutureSoft", 93, "Target"));
    }

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }

    public boolean updateStatus(Long id, String status) {
        Account account = accounts.get(id);
        if (account != null) {
            account.setStatus(status);
            return true;
        }
        return false;
    }
}