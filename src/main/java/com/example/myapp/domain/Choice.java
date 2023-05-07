package com.example.myapp.domain;

public class Choice{

    private int choiceId;
    private String context;

    public Choice(){
    }

    public Choice(int choiceId, String context){
        this.choiceId = choiceId;
        this.context = context;
    }

    public int getChoiceId(){
        return this.choiceId;
    }
    public void setChoiceId(int choiceId){
        this.choiceId = choiceId;
    }

    public String getContext(){
        return this.context;
    }
    public void setContext(String context){
        this.context = context;
    }
}
