package com.bankapp.genericAPI.entity;

import com.bankapp.genericAPI.Transaction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tbl_accounts")
public class Account {
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private String userName;
    private Long balance;
    private String Password;
    private List<Transaction> transactionList = new ArrayList<>();

    public Account() {
    }

    public Account(String userName, String password) {
        this.userName = userName;
        Password = password;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {return this.transactionList;}
}
