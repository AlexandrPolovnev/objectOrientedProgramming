package com.company.objectOrientedProgramming;

public class Ravenclaw extends Hogwartz{
    public int reasonableness;
    public int wisdom;
    public int wit;
    public int creation;

    public Ravenclaw (String mag, int magic, int transgression, int reasonableness, int wisdom, int wit, int creation){
        super(mag, magic, transgression);
        this.reasonableness = reasonableness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getReasonableness() {
        return reasonableness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString(){
        return mag +
                " - разумность " + reasonableness
                + ", мудрость " + wisdom
                + ", остроумие " + wit
                + ", творчество " + creation;
    }
}

