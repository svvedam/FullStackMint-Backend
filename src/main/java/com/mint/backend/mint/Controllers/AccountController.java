package com.mint.backend.mint.Controllers;

import com.mint.backend.mint.Entity.Account;
import com.mint.backend.mint.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/accounts/")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account returnAccount = accountService.createAccount(account);
        return (returnAccount == null) ? (new ResponseEntity<>(HttpStatus.BAD_REQUEST))
                : new ResponseEntity<>(returnAccount,HttpStatus.CREATED);

    }

//    @PostMapping("/categories/")
//    public ResponseEntity<Category> create(@RequestBody Category category) {
//
//        Category returnCategory = categoryService.createCategory(category);
//        return (returnCategory == null) ? (new ResponseEntity<>(HttpStatus.BAD_REQUEST))
//                : new ResponseEntity<>(returnCategory,HttpStatus.CREATED);
//
//
//    }

    @GetMapping("/accounts/")
    public List<Account> getAccounts(){
       List<Account> accountList = accountService.getAllAccounts();

        return accountList;
    }

//    @GetMapping("/persons/")
//    public List<Person> getPersonList(){
//        List<Person> returnPersonList = personRepository.findAll();
//        return returnPersonList;
//    }

}
