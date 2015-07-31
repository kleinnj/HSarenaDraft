package com.example.nick.hsarenadraft;

/**
 * Created by Nick on 7/17/2015.
 */
public class Card implements Comparable<Card>{

    private String name;
    private String text;
    private String heroClass;
    private String cardType;
    private int manaCost;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

    public void setText(String t){
        this.text = t;
    }
    public String getText(){
        return this.text;
    }

    public void setHeroClass(String hero){
        this.heroClass = hero;
    }
    public String getHeroClass(){
        return this.heroClass;
    }

    public void setCardType(String ty){
        this.cardType = ty;

    }
    public String getCardType(){
        return this.cardType;
    }

    public void setManaCost(int c){
        this.manaCost = c;
    }
    public int getManaCost(){
        return this.manaCost;
    }


    @Override
    public int compareTo(Card another) {
        return this.name.compareTo(another.name);
    }
}
