package com.company.objectOrientedProgramming;

public class Hufflepuff extends Hogwartz{
    public String name;
    public int magic;
    public int transgression;
    public int industriousness;
    public int loyalty;
    public int honesty;

    public Hufflepuff (String name, int magic, int transgression, int industriousness, int loyalty, int honesty){
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString(){
        return name + " - трудолюбивость " + industriousness + ", верность " + loyalty + ", честность " + honesty;
    }
}
