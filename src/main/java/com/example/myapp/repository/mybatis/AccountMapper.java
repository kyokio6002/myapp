package com.example.myapp.repository.mybatis;

import java.util.List;
import com.example.myapp.domain.Account;
import org.apache.ibatis.annotations.Param;


public interface AccountMapper {

    public List<Account> find(@Param("accounId")String accountId, @Param("emailAdress")String emailAdress);

    public Account get(@Param("accounId")String accountId);

    // public Account lock(@Param("accounId")String accountId);

    // public void add(Account account);

    // public void set(Account account);

    // public void remove(Account account);

}
