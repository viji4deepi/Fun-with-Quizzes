package com.company;

public class LinearScale extends Question{

    //fields
    private int lowestValue;
    private int highestValue;
    public LinearScale(String question, int lowestValue,int highestValue) {
        super(question, null);
        this.lowestValue = lowestValue;
        this.highestValue = highestValue;
    }

    public int getLowestValue() {
        return lowestValue;
    }

    public int getHighestValue() {
        return highestValue;
    }

    @Override
    public boolean check(String answer) {
        int answerValue = Integer.parseInt(answer);
        if(answerValue>= lowestValue && answerValue <= highestValue){
        return true;
        } else {
            return false;
        }
    }
}
