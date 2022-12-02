package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.model.Transaction;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class TransactionServiceConcreteTest {
    @Autowired
    private TransactionService transactionService;
    private Transaction transaction = new Transaction(-1, 0, -1, -1);
    private int testId = -1;
    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
        if(transactionService.getAllTransactions().size() != 0) {
            testId = transactionService.getLatestTransactionId();
            transaction.setTransactionId(testId);
        }
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("Finished..." + testInfo.getDisplayName());
    }

    @Test
    @Order(1)
    void addTransaction() {
        assertTrue(transactionService.addTransaction(transaction) != null);
    }

    @Test
    @Order(2)
    void getTransactionById() {
        assertEquals(transaction, transactionService.getTransactionById(testId));
    }

    @Test
    @Order(3)
    void getAllTransactions() {
        assertFalse(0 == transactionService.getAllTransactions().size());
    }

    @Test
    @Order(4)
    void getAllAccountTransactions() {
        assertFalse(0 == transactionService.getAllAccountTransactions(-1).size());
    }

    @Test
    @Order(5)
    void deleteTransactionById() {
        assertEquals(true, transactionService.deleteTransactionById(testId));
    }

    @Test
    @Order(6)
    void deleteNonExistestentTransactionById() {
        assertThrows(NoSuchElementException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                transactionService.deleteTransactionById(-1);
            }
        });
    }
}