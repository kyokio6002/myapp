package com.example.myapp.domain;

public class Account{

    private String userId;
    private String emailAdress;

    public Account(){
        this("guest", "none");
    }

    public Account(String userId, String emailAdress){
        this.userId = userId;
        this.emailAdress = emailAdress;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getEmailAdress(){
        return this.emailAdress;
    }

    public void setEmailAdress(String emailAdress){
        this.emailAdress = emailAdress;
    }
}
