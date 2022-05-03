package com.company;

public class ShortAnswer extends Question{

    public ShortAnswer(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean check(String answer) {
        if(answer.length() >= 50) {
            System.out.println("The answer is longer than 50 words");
        }
        String correctAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(correctAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
