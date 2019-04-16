package com.mint.backend.mint.Service;

import com.mint.backend.mint.Entity.Account;
import com.mint.backend.mint.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {

        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {

        return accountRepository.findAll();
    }
}
