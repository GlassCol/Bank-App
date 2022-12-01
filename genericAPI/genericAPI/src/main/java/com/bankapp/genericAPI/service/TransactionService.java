package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();
    List<Transaction> getAllAccountTransactions(int accountId);
    Transaction getTransactionById(int transactionId);
    Transaction addTransaction(Transaction transaction);
    boolean deleteTransactionById(int transactionId);
    int getLatestTransactionId();
}
