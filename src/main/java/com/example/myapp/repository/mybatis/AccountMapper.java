package com.example.myapp.repository.mybatis;

import java.util.List;
import com.example.myapp.domain.Account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AccountMapper {

    public List<Account> find(@Param("accountId")String accountId, @Param("emailAddress")String emailAddress);

    // public Account get(@Param("accountId")String accountId);

    // public Account lock(@Param("accountId")String accountId);

    // public void add(Account account);

    // public void set(Account account);

    // public void remove(Account account);

}
