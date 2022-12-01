package com.bankapp.genericAPI.controller;

import com.bankapp.genericAPI.model.Transaction;
import com.bankapp.genericAPI.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/transactions")
    public List<Transaction> getTransactions(){
        return transactionService.getAllTransactions();
    }
    @GetMapping("/transactions/{transactionId}")
    public ResponseEntity<Transaction> getTransaction(@PathVariable int transactionId){
        Transaction transaction = null;
        transaction = transactionService.getTransactionById(transactionId);
        return ResponseEntity.ok(transaction);
    }
    @PostMapping("/transactions")
    public Transaction addTransaction(@RequestBody Transaction transaction){
        return transactionService.addTransaction(transaction);
    }
    @DeleteMapping("/transactions/{transactionId}")
    public boolean deleteTransactionById(@PathVariable int transactionId){
        boolean deleted = false;
        deleted = transactionService.deleteTransactionById(transactionId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return deleted;
    }
}
