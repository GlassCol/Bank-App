package com.bankapp.genericAPI.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_accounts")
public class Account {
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;

    private String userName;

    private String Password;

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
}
