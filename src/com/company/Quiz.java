package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();
    int score = 0;
    Scanner input = new Scanner(System.in);

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void addQuestions(Question questions){
      this.questions.add(questions);
    }


    //run method
    public void run(){
        for (Question question: questions ) {
            System.out.println(question.getQuestion());
            String userAnswer = input.nextLine();
            //check answer
            boolean userCorrectAnswers = question.check(userAnswer);
            if(userCorrectAnswers){
                score++;
            }
        }
        //grade quiz
        double percentage = ((double) this.score/(double)this.questions.size())*100;
        System.out.println("Grade :"+percentage+"%");
    }

}
