package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(int AccountId);
    Account addAccount(Account Account);
    Account updateAccount(int id, Account Account);
    Boolean deleteAccountById(int accountId);
    int getLatestAccountId();
}
