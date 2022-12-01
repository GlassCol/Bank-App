package com.bankapp.genericAPI;

/**
 * Class containing the information for an account transaction
 * @author Cole Glass
 */
public class Transaction {
    private int transactionAmount;
    private int origin;
    private int destination;
    private Boolean valid = false;

    public Transaction() {
    }

    public Transaction(int origin, int destination, int transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.origin = origin;
        this.destination = destination;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
