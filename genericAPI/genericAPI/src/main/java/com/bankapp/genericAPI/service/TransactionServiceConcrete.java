package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.dao.TransactionDao;
import com.bankapp.genericAPI.entity.TransactionEntity;
import com.bankapp.genericAPI.model.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceConcrete implements TransactionService {
    @Autowired
    private TransactionDao transactionDao;
    @Autowired
    private AccountService accountService;
    @Override
    public List<Transaction> getAllTransactions() {
        List<TransactionEntity> transactionEntities = transactionDao.findAll();
        List<Transaction> transactions = transactionEntities.stream()
                .map(transaction -> new Transaction(transaction.getTransactionId(), transaction.getTransactionAmount(),
                        transaction.getOrigin(), transaction.getDestination()))
                .collect(Collectors.toList());
        return transactions;
    }

    @Override
    public List<Transaction> getAllAccountTransactions(int accountId) {
        List<TransactionEntity> transactionEntities = transactionDao.findAll();
        List<Transaction> transactions = transactionEntities.stream()
                .map(transaction -> new Transaction(transaction.getTransactionId(), transaction.getTransactionAmount(),
                        transaction.getOrigin(), transaction.getDestination()))
                .filter(transaction -> transaction.getOrigin() == accountId || transaction.getDestination() == accountId)
                .collect(Collectors.toList());
        return transactions;
    }

    @Override
    public Transaction getTransactionById(int transactionId) {
        TransactionEntity transactionEntity = transactionDao.findById(transactionId).get();
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionEntity, transaction);
        return transaction;
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        TransactionEntity transactionEntity = new TransactionEntity();
        BeanUtils.copyProperties(transaction, transactionEntity);
        transactionDao.save(transactionEntity);
        transaction = transactionDao.findLastAddition();
        return transaction;
    }

    @Override
    public boolean deleteTransactionById(int transactionId) throws IllegalArgumentException{
        TransactionEntity transaction = transactionDao.findById(transactionId).get();
        transactionDao.delete(transaction);
        return true;
    }

    @Override
    public int getLatestTransactionId() {
        return transactionDao.findLastAddition().getTransactionId();
    }
}
