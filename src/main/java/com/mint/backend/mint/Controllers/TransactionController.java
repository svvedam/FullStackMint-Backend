package com.mint.backend.mint.Controllers;

import com.mint.backend.mint.Entity.Transaction;
import com.mint.backend.mint.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions/{account_bid}/{category_id}")
    public ResponseEntity<Transaction> create(@PathVariable("account_bid") Integer account_bid, @PathVariable("category_id") Integer category_id,@RequestBody Transaction transaction) {

        Transaction returnTransaction = transactionService.createTransaction(account_bid,category_id,transaction);
        return (returnTransaction == null) ? (new ResponseEntity<>(HttpStatus.BAD_REQUEST))
                : new ResponseEntity<>(returnTransaction,HttpStatus.CREATED);
    }
}
