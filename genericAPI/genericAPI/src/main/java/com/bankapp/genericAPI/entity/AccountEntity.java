package com.bankapp.genericAPI.entity;



import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="accounts")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private String userName;
    private String firstName;
    private String lastName;
    private Double balance = 0.0;
    private String password;
}
