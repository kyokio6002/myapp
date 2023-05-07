package com.example.myapp.repository;

import com.example.myapp.domain.Account;
import java.util.List;

public interface AccountRepository{

    public List<Account> findList(String accountId, String emailAddress);
}
