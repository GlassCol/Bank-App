package com.bankapp.genericAPI.service;

import com.bankapp.genericAPI.model.Account;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class AccountServiceConcreteTest {

    @Autowired
    private AccountService accountService;
    private Account account = new Account(-1, "test", "Mr", "Test",
            0.0, "test");
    private int testId = -1;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Start..." + testInfo.getDisplayName());
        if(accountService.getAllAccounts().size() != 0) {
            testId = accountService.getLatestAccountId();
            account.setAccountId(testId);
        }
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println("Finished..." + testInfo.getDisplayName());
    }

    @Test
    @Order(1)
    void addAccount() {
        assertTrue(accountService.addAccount(account) != null);
    }
    @Order(2)
    @Test
    void getAccountById() {
        assertEquals(account, accountService.getAccountById(testId));
    }
    @Order(3)
    @Test
    void updateAccount() {
        account.setFirstName("Test");
        accountService.updateAccount(testId, account);
        assertEquals("Test", accountService.getAccountById(testId).getFirstName());
    }
    @Order(4)
    @Test
    void getAllAccounts() {
        assertFalse(0 == accountService.getAllAccounts().size());
    }
    @Order(7)
    @Test
    void doTransaction() {
    }
    @Order(8)
    @Test
    void deleteAccountById() {
        assertEquals(true, accountService.deleteAccountById(testId));
    }
    @Order(9)
    @Test
    void deleteNonExistentAccount() {
        assertThrows(NoSuchElementException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                accountService.deleteAccountById(-1);
            }
        });
    }

}