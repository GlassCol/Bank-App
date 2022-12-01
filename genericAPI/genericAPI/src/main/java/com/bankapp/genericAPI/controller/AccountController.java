package com.bankapp.genericAPI.controller;

import com.bankapp.genericAPI.entity.Account;
import com.bankapp.genericAPI.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return this.accountService.getAllAccounts();
    }
    @GetMapping("/accounts/{accountId}")
    public Account getAccount(@PathVariable String accountId){
        return this.accountService.getAccountById(Integer.parseInt(accountId));
    }
    @PostMapping("/accounts")
    public Account addAccount(@RequestBody Account account){
        return this.accountService.addAccount(account);
    }
    @PutMapping("/accounts")
    public Account updateAccount(@RequestBody Account account){
        return this.accountService.updateAccount(account);
    }
    @DeleteMapping("/accounts/{accountId}")
    public String deleteAccountById(@PathVariable String accountId){
        return this.accountService.deleteAccountById(Integer.parseInt(accountId));
    }
}
