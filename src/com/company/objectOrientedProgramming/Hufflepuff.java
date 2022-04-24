package com.company.objectOrientedProgramming;

public class Hufflepuff extends Hogwartz{
    public int industriousness;
    public int loyalty;
    public int honesty;

    public Hufflepuff (String mag, int magic, int transgression, int industriousness, int loyalty, int honesty){
        super(mag, magic, transgression);
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
        return mag + " - трудолюбивость " + industriousness + ", верность " + loyalty + ", честность " + honesty;
    }
}
