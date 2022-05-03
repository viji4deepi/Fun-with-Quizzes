package com.company;

public abstract class Question {
    //fields
    String question;
    String answer;

    //constructors
    public Question(String question,String answer){
        this.question = question;
        this.answer = answer;
    }
    //getters and setters

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public abstract boolean check(String answer);
    //toString
}
