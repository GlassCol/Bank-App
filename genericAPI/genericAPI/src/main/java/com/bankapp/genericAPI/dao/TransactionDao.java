package com.bankapp.genericAPI.dao;

import com.bankapp.genericAPI.entity.TransactionEntity;
import com.bankapp.genericAPI.model.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDao extends JpaRepository<TransactionEntity, Integer> {
    /**
     * Gets the last element from the jpa
     * @return Transaction: the last transaction in the database
     */
    public default Transaction findLastAddition() {
        List<TransactionEntity> transactionEntities = findAll();
        TransactionEntity transactionEntity = new TransactionEntity();
        if(transactionEntities.size() != 0) {
            transactionEntity = transactionEntities.get(transactionEntities.size() - 1);
        } else {
            transactionEntity = transactionEntities.get(0);
        }
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionEntity, transaction);
        return transaction;
    }
}

