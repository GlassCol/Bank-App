package com.bankapp.genericAPI.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class AccountServiceConcreteTest {

    @Autowired
    private AccountService accountService;
    private int testId = -1;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
        testId = accountService.getLatestAccountId();
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("Finished..." + testInfo.getDisplayName());
    }

    @Test
    @Order(1)
    void addAccount() {
    }
    @Order(2)
    @Test
    void updateAccount() {
    }
    @Order(3)
    @Test
    void getAccountById() {
    }
    @Order(4)
    @Test
    void getAllAccounts() {
    }
    @Order(5)
    @Test
    void isValidTransaction() {
    }
    @Order(6)
    @Test
    void isInValidTransaction() {
    }
    @Order(7)
    @Test
    void doTransaction() {
    }
    @Order(8)
    @Test
    void deleteAccountById() {
    }

}