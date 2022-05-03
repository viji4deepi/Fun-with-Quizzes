package com.company;

public class QuizRunner {
    public static void main(String[] args) {
    Quiz quiz = new Quiz();
        MultipleChoice multipleChoiceQuestion = new MultipleChoice("What is 2 + 2?\n"
                +"a)5\n b)3\n c)4\n d)8\n","c");
        quiz.addQuestions(multipleChoiceQuestion);

        CheckBox checkboxQuestion = new CheckBox("Find the odd numbers :\n"+"a)2\n"+"b)5\n"+"c)11\n"+"d)6\n","b,c");
        quiz.addQuestions(checkboxQuestion);

        TrueOrFalse trueOrFalseQuestion = new TrueOrFalse("3 is a prime number?\n"+"True or False","True");
        quiz.addQuestions(trueOrFalseQuestion);

        ShortAnswer shortAnswerQuestion = new ShortAnswer("Which direction the sunrises?", "east");
        quiz.addQuestions(shortAnswerQuestion);

        LinearScale linearScaleQuestion = new LinearScale("Tell your Java understanding level 4-lowest and 10-heighest",4,10);
        quiz.addQuestions(linearScaleQuestion);

        Paragraph paragraphQuestion = new Paragraph("Do you love dogs?","I love dogs");
        quiz.addQuestions(paragraphQuestion);

        quiz.run();
    }
}
