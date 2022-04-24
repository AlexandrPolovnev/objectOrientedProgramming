package com.company.objectOrientedProgramming;

public class Slytherin extends Hogwartz {
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustOfPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    @Override
    public String toString(){
        return name + " - хитрость " + cunning
                + ", решительность " + determination
                + ", амбициозность " + ambition
                + ", находчивость " + resourcefulness
                + ", жажда власти " + lustOfPower;
    }

}

