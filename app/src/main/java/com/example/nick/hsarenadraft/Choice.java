package com.example.nick.hsarenadraft;

/**
 * Created by Nick on 7/17/2015.
 */
public class Choice implements Comparable<Choice> {


    private Card cardOne;
    private Card cardTwo;
    private Card cardThree;
    private int cardChosen;

    public void setCardOne(Card one){
        this.cardOne = one;
    }
    public Card getCardOne(){
        return this.cardOne;
    }

    public void setCardTwo(Card two){
        this.cardTwo = two;
    }
    public Card getCardTwo(){
        return this.cardTwo;
    }
    public void setCardThree(Card three){
        this.cardThree = three;
    }
    public Card getCardThree(){
        return this.cardThree;
    }

    public void setCardChosen(int c){
        this.cardChosen = c;
    }
    public int getCardChosen(){
        return this.cardChosen;
    }


    @Override
    public int compareTo(Choice another) {
        return 0;
    }
}
