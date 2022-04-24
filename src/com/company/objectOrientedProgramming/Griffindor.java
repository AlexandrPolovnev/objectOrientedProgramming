package com.company.objectOrientedProgramming;

public class Griffindor extends Hogwartz {
    public int nobility;
    public int honour;
    public int bravery;

    public Griffindor(String mag, int magic, int transgression, int nobility, int honour, int bravery) {
        super(mag, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }


    public int getBravery() {
        return bravery;
    }

    public int getHonour() {
        return honour;
    }

    public int getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return mag + " - благородство " + nobility + ", честь " + honour + ", храбрость " + bravery;
    }
}
