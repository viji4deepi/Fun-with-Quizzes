package com.company;

public class Paragraph extends Question{


    public Paragraph(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean check(String answer) {
        if(answer.length() > 500) {
            System.out.println("The answer is longer than 500 words");
        }
        String correctAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(correctAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
