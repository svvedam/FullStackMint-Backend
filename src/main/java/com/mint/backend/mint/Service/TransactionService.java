package com.mint.backend.mint.Service;

import com.mint.backend.mint.Entity.Account;
import com.mint.backend.mint.Entity.Category;
import com.mint.backend.mint.Entity.Transaction;
import com.mint.backend.mint.Repository.AccountRepository;
import com.mint.backend.mint.Repository.CategoryRepository;
import com.mint.backend.mint.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Transaction createTransaction(Integer accid, Integer category_id,Transaction transaction) {
        Account accountToBeSet = accountRepository.getOne(accid);
        transaction.setAccount(accountToBeSet);

        Category categoryToBeSet = categoryRepository.getOne(category_id);
        transaction.setCategory(categoryToBeSet);

        return transactionRepository.save(transaction);
    }
}
