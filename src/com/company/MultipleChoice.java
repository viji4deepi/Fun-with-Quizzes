package com.company;

public class MultipleChoice extends Question{


    public MultipleChoice(String question, String answer) {
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
