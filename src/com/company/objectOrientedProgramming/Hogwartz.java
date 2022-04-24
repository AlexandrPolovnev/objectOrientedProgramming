package com.company.objectOrientedProgramming;

public class Hogwartz {
    public String mag;
    public int magic;
    public int transgression;

    public Hogwartz (String mag, int magic, int transgression){
        this.mag = mag;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getMag(){
        return mag;
    }

    public int getMagic(){
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Ученик " + mag + ", сила магии " + magic + ", трансгрессия " + transgression;
    }


}
