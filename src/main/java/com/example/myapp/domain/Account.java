package com.example.myapp.domain;

public class Account{

    private String userId;
    private String emailAddress;

    public Account(){
        this("guest", "none");
    }

    public Account(String userId, String emailAddress){
        this.userId = userId;
        this.emailAddress = emailAddress;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setEmailAddrdess(String emailAddress){
        this.emailAddress = emailAddress;
    }
}