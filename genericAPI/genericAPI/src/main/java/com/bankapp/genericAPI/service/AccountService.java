package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.entity.Account;
import com.bankapp.genericAPI.Transaction;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(int AccountId);
    Account addAccount(Account Account);
    Account updateAccount(Account Account);
    String deleteAccountById(int accountId);
    Transaction doTransaction(int origin, int destination, int amount);
    int getLatestAccountId();
}
