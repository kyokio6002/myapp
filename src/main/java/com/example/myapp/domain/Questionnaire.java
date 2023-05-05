package com.example.myapp.domain;

public class Questionnaire{

    private int questionnaire_id;
    private String accountId;
    private String context;

    public Questionnaire(){
    }

    public Questionnaire(int questionnaire_id, String accountId, String context){
        this.questionnaire_id = questionnaire_id;
        this.accountId = accountId;
        this.context = context;
    }

    public int getQuestionnaireId(){
       return this.questionnaire_id; 
    }
    public void setQuestionnaireId(int questionnaire_id){
        this.questionnaire_id = questionnaire_id;
    }

    public String getAccountId(){
        return this.accountId;
    }
    public void setAccountId(String accountId){
        this.accountId = accountId;
    }

    public String getContext(){
        return this.context;
    }
    public void setContext(String context){
        this.context = context;
    }
}
