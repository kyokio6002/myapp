package com.example.myapp.service;

import org.springframework.stereotype.Service;

import com.example.myapp.repository.AccountRepository;
import com.example.myapp.domain.Account;
import java.util.List;


@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> find(String accountId, String emailAdress){
        return accountRepository.findList(accountId, emailAdress);
    }
}
