package com.company.objectOrientedProgramming;


public class PrintService {
    public void print (Hogwartz[]students) {
        for (int i = 0; i < students.length; i++) {
            Hogwartz hogwartz = students[i];
            System.out.println("Имя: " + hogwartz.getName() +
                    "; Сила магии " + hogwartz.getMagic() +
                    "; Сила трансгресии " + hogwartz.getTransgression());
        }
        System.out.println();
    }

        public void print (Griffindor[]griffindors) {
            for (int i = 0; i < griffindors.length; i++) {
                Griffindor griffindor = griffindors[i];
                System.out.println("Имя: " + griffindor.getName() +
                        ", благородство " + griffindor.getNobility() +
                        ", честь " + griffindor.getHonour() +
                        ", храбрость " + griffindor.getBravery());
            }
            System.out.println();
        }
        public void print (Slytherin[] slytherins){
            for (int i = 0; i < slytherins.length; i++) {
                Slytherin slytherin = slytherins[i];
                System.out.println("Имя: " + slytherin.getName()+
                        ", хитрость "+ slytherin.getCunning()+
                        ", решительность "+ slytherin.getDetermination()+
                        ", амбиции "+ slytherin.getAmbition()+
                        ", находчивость " + slytherin.getResourcefulness()+
                        ", жажда власти " + slytherin.getLustOfPower());
            }
            System.out.println();
        }
    public void print (Hufflepuff[] hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getName()+
                    ", трудолюбивость "+ hufflepuff.getIndustriousness()+
                    ", верность " + hufflepuff.getLoyalty()+
                    ", честность " + hufflepuff.getHonesty());
        }
        System.out.println();
    }
    public void print (Ravenclaw[] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: "+ ravenclaw.getName()+
                    ", разумность " + ravenclaw.getReasonableness()+
                    ", мудрость "+ ravenclaw.getWisdom()+
                    ", остроумие "+ ravenclaw.getWit()+
                    ", творчество "+ ravenclaw.getCreation());
        }
        System.out.println();
    }


    }

