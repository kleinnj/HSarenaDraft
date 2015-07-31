package com.example.nick.hsarenadraft;

import java.util.ArrayList;

/**
 * Created by Nick on 7/25/2015.
 */
public class Deck implements Comparable<Deck> {
    private int id;
    private String name;
    private ArrayList<Card> deckList;
    private ArrayList<Choice> choiceList;

    public int getid(){
        return id;
    }
    public void setId(int c){
        id = c;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public ArrayList<Card> getDeckList(){
        return deckList;
    }
    public void setDeckList(ArrayList<Card> dl){
        deckList = dl;
    }
    public ArrayList<Choice> getChoiceList(){
        return choiceList;
    }
    public void setChoiceList(ArrayList<Choice> cl){
        choiceList = cl;
    }


    @Override
    public int compareTo(Deck another) {
        if(another.id == id){
            return 1;
        }else {
            return 0;
        }
    }
}
