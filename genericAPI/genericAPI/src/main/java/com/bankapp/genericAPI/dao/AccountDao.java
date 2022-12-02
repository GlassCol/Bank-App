package com.bankapp.genericAPI.dao;

import com.bankapp.genericAPI.entity.AccountEntity;
import com.bankapp.genericAPI.model.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Integer> {
    /**
     * Gets the last element from the jpa
     * @return Account: the last account in the database
     */
    public default Account findLastAddition() {
        List<AccountEntity> accountEntities = findAll();
        AccountEntity accountEntity = new AccountEntity();
        if(accountEntities.size() != 0) {
            accountEntity = accountEntities.get(accountEntities.size() - 1);
        } else {
            accountEntity = accountEntities.get(0);
        }
        Account account = new Account();
        BeanUtils.copyProperties(accountEntity, account);
        return account;
    }
}
