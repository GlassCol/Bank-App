package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.dao.AccountDao;
import com.bankapp.genericAPI.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceConcrete implements AccountService{
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccounts() {return accountDao.findAll();}

    @Override
    public Account getAccountById(int accountId) {
        Optional<Account> c = this.accountDao.findById(accountId);
        Account account = null;
        if(c.isPresent()){
            account = c.get();
        }else {
            throw new RuntimeException("account not found for id :: " + accountId);
        }
        return account;
    }

    @Override
    public Account addAccount(Account account) {
        return this.accountDao.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        return this.accountDao.save(account);
    }

    @Override
    public String deleteAccountById(int accountId) {
        this.accountDao.deleteById(accountId);
        return "Account " + accountId + " has been deleted";
    }
}
