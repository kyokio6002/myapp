package com.example.myapp.repository;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.myapp.domain.Account;
import com.example.myapp.repository.mybatis.AccountMapper;


@Repository
public class AccountRepositoryImpl implements AccountRepository{

    private final SqlSessionTemplate sqlSessionTemplate;
    public AccountRepositoryImpl(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Account> find(String accountId, String emailAdress){
        return sqlSessionTemplate.getMapper(AccountMapper.class).find(accountId, emailAdress);
    }

}
