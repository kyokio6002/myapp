package com.example.myapp.service;

import java.util.List;

import com.example.myapp.domain.Account;


public interface AccountService{

    public List<Account> find(String accountId, String emailAdress);
    
}
