package com.example.myapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.AccountService;
import com.example.myapp.domain.Account;


// XXX: 順番はこれじゃないとだめ？
@RestController
@RequestMapping("/api/test")
public class AccountController{

    private final AccountService service;

    public AccountController(AccountService service){
        this.service = service;
    }


    @GetMapping(path = "", produces = "application/json")
    public List<Account> find(
            @RequestParam(name="accountId", required=false)String accountId, 
            @RequestParam(name="emailAdress", required=false)String emailAdress){
        return service.find(accountId, accountId);
    }
}
