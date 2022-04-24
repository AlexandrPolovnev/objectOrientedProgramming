package com.company.objectOrientedProgramming;

public class Hogwartz {
    public String name;
    public int magic;
    public int transgression;

    public Hogwartz (String name, int magic, int transgression){
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName(){
        return name;
    }

    public int getMagic(){
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Ученик " + name + ", сила магии " + magic + ", трансгрессия " + transgression;
    }


}
