package com.bankapp.genericAPI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    private int transactionAmount;
    private int origin;
    private int destination;
}
