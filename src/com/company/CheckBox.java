package com.company;

public class CheckBox extends Question{


    public CheckBox(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean check(String answer) {
        String correctAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(correctAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
