package com.example.myapp.repository;

import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.AbstractTestExecutionListener;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.example.myapp.MyAppApplication;
import com.example.myapp.domain.Account;


public class AccountRepositoryTests{

    @SpringBootTest(classes = MyAppApplication.class)
    @TestExecutionListeners({DependencyInjectionTestExecutionListener.class,})
    @Nested
    public class FindDbTest extends AbstractTestExecutionListener{

        @Autowired
        private AccountRepository target;

        @Test
        public void testFindAll() throws Exception {
            // List<Account> account = target.findList("test01", "test@email.com");
            List<Account> account = target.findList("test01", "test@email.com");
            assertEquals(1, account.size());
        }

    }

}
