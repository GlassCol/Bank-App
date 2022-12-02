package com.bankapp.genericAPI.controller;

import com.bankapp.genericAPI.model.Account;
import com.bankapp.genericAPI.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }
    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Account> getAccount(@PathVariable String accountId){
        Account account = null;
        account = accountService.getAccountById(Integer.parseInt(accountId));
        return ResponseEntity.ok(account);
    }
    @PostMapping("/accounts")
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }
    @PutMapping("/accounts")
    public ResponseEntity<Account> updateAccount(@PathVariable int accountId, @RequestBody Account account){
        account = accountService.updateAccount(accountId, account);
        return ResponseEntity.ok(account);
    }
    @DeleteMapping("/accounts/{accountId}")
    public ResponseEntity<Map<String, Boolean>> deleteAccountById(@PathVariable int accountId){
        boolean deleted = false;
        deleted = accountService.deleteAccountById(accountId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
}
