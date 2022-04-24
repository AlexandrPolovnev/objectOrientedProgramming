package com.company.objectOrientedProgramming;

public class Slytherin extends Hogwartz {
    public int cunning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustOfPower;

    public Slytherin(String mag, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(mag, magic, transgression);
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
        return mag + " - хитрость " + cunning
                + ", решительность " + determination
                + ", амбициозность " + ambition
                + ", находчивость " + resourcefulness
                + ", жажда власти " + lustOfPower;
    }

}

