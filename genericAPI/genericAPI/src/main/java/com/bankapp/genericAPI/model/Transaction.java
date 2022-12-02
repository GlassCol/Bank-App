package com.bankapp.genericAPI.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Class containing the information for an account transaction
 * @author Cole Glass
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private int transactionId;
    private int transactionAmount;
    private int origin;
    private int destination;
}
