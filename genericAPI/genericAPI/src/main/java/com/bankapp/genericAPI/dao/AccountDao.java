package com.bankapp.genericAPI.dao;

import com.bankapp.genericAPI.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {
    /**
     * Gets the last element from the jpa
     * @return Account: the last account in the database
     */
    public default Account findLastAddition() {
        return findAll().get(findAll().size() - 1);
    }
}
