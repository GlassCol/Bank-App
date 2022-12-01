package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.dao.AccountDao;
import com.bankapp.genericAPI.entity.Account;
import com.bankapp.genericAPI.Transaction;
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

    /**
     * Method to send a transaction between two accounts
     * @param origin the account that sends the money
     * @param destination the account that receives the money
     * @param amount the amount of money to be sent
     * @return Transaction : The transaction completed
     */
    @Override
    public Transaction doTransaction(int origin, int destination, int amount) {
        Account originAccount = getAccountById(origin);
        Account destinationAccount = getAccountById(destination);
        Transaction transaction = new Transaction(originAccount.getAccountId(), destinationAccount.getAccountId(), amount);
        if(isValidTransaction(transaction)){
            originAccount.setBalance(originAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            originAccount.getTransactionList().add(transaction);
            destinationAccount.getTransactionList().add(transaction);
            updateAccount(originAccount);
            updateAccount(destinationAccount);
        }
        return transaction;
    }

    /**
     * Method to check if a transaction is valid
     * @param transaction the transaction to be checked
     * @return Boolean : True if the transaction is valid, false otherwise
     */
    public boolean isValidTransaction(Transaction transaction) {
        return (getAccountById(transaction.getOrigin()).getBalance() - transaction.getTransactionAmount() < 0);
    }

    @Override
    public int getLatestAccountId() {
        return accountDao.findLastAddition().getAccountId();
    }
}
