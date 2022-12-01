package com.bankapp.genericAPI.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int accountId;
    private String userName;
    private String firstName;
    private String lastName;
    private Double balance = 0.0;
    private String password;
}
