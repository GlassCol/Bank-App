package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.dao.AccountDao;
import com.bankapp.genericAPI.entity.AccountEntity;
import com.bankapp.genericAPI.model.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountServiceConcrete implements AccountService{
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccounts() {
        List<AccountEntity> accountEntities = accountDao.findAll();
        List<Account> accounts = accountEntities.stream()
                .map(account -> new Account(account.getAccountId(), account.getUserName(),
                        account.getFirstName(), account.getLastName(), account.getBalance(), account.getPassword()))
                .collect(Collectors.toList());
        return accounts;
    }

    @Override
    public Account getAccountById(int accountId) {
        AccountEntity accountEntity = accountDao.findById(accountId).get();
        Account account = new Account();
        BeanUtils.copyProperties(accountEntity, account);
        return account;
    }

    @Override
    public Account addAccount(Account account) {
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(account, accountEntity);
        accountDao.save(accountEntity);
        account = accountDao.findLastAddition();
        return account;
    }

    @Override
    public Account updateAccount(int accountId, Account account) {
        AccountEntity accountEntity = accountDao.findById(accountId).get();
        accountEntity.setBalance(account.getBalance());
        accountEntity.setFirstName(account.getFirstName());
        accountEntity.setLastName(account.getLastName());
        accountEntity.setPassword(account.getPassword());
        accountEntity.setUserName(account.getUserName());
        accountDao.save(accountEntity);
        return account;
    }

    @Override
    public Boolean deleteAccountById(int accountId) {
        AccountEntity account = accountDao.findById(accountId).get();
        accountDao.delete(account);
        return true;
    }

    @Override
    public int getLatestAccountId() {
        return accountDao.findLastAddition().getAccountId();
    }
}
