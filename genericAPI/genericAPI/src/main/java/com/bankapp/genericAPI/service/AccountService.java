package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(int AccountId);
    Account addAccount(Account Account);
    Account updateAccount(Account Account);
    String deleteAccountById(int accountId);
}
