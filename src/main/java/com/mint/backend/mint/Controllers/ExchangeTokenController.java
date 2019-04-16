package com.mint.backend.mint.Controllers;

import com.mint.backend.mint.Entity.Account;
import com.mint.backend.mint.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeTokenController {

    @Autowired
    AccountService accountService;

    @PostMapping("/publicToken/")
    public ResponseEntity<Account> publicToken(@RequestBody Account account){
        Account returnAccount = accountService.createAccount(account);
        return (returnAccount == null) ? (new ResponseEntity<>(HttpStatus.BAD_REQUEST))
                : new ResponseEntity<>(returnAccount,HttpStatus.CREATED);

    }
}
