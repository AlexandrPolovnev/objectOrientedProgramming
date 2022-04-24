package com.company.objectOrientedProgramming;

public class PrintService {
    public static void bestMagOfGriffindor(Griffindor[] griffindors){
        int result;
        String name = griffindors[0].getMag();
        int max;
        for (int i = 0; i < griffindors.length; i++) {
            result = griffindors[i].bravery + griffindors[i].honour + griffindors[i].nobility;
            max = griffindors[0].bravery + griffindors[0].honour + griffindors[0].nobility;
            if (result > max){
                name = griffindors[i].getMag();
            }
        }
        System.out.println("Лучший студент Гриффиндора  - " +  name);
    }

    public static void bestMagOfSlytherin(Slytherin[] slytherins){
        int result;
        String name = slytherins[0].getMag();
        int max;
        for (int i = 0; i < slytherins.length; i++) {
            result = slytherins[i].cunning + slytherins[i].determination + slytherins[i].ambition +
                    slytherins[i].resourcefulness + slytherins[i].lustOfPower;
            max = slytherins[0].cunning + slytherins[0].determination + slytherins[0].ambition +
                    slytherins[0].resourcefulness + slytherins[0].lustOfPower;
            if (result > max){
                name = slytherins[i].getMag();
            }
        }
        System.out.println("Лучший студент Слизерина - " +  name);
    }

    public static void bestMagOfHufflepuff(Hufflepuff[] hufflepuffs){
        int result;
        String name = hufflepuffs[0].getMag();
        int max;
        for (int i = 0; i < hufflepuffs.length; i++) {
            result = hufflepuffs[i].industriousness + hufflepuffs[i].loyalty + hufflepuffs[i].honesty;
            max = hufflepuffs[0].industriousness + hufflepuffs[0].loyalty + hufflepuffs[0].honesty;
            if (result > max){
                name = hufflepuffs[i].getMag();
            }
        }
        System.out.println("Лучший студент Пуфендуя - " +  name);
    }

    public static void bestMagOfRavenclaw(Ravenclaw[] ravenclaws){
        int result;
        String name = ravenclaws[0].getMag();
        int max;
        for (int i = 0; i < ravenclaws.length; i++) {
            result = ravenclaws[i].reasonableness + ravenclaws[i].wisdom + ravenclaws[i].wit + ravenclaws[i].creation;
            max = ravenclaws[0].reasonableness + ravenclaws[0].wisdom + ravenclaws[0].wit + ravenclaws[i].creation;
            if (result > max){
                name = ravenclaws[i].getMag();
            }
        }
        System.out.println("Лучший студент Когтеврана - " +  name);
    }

    public static void bestMagOfHogwartz(Hogwartz[] students){
        int result;
        String name = students[0].getMag();
        int max;
        for (int i = 0; i < students.length; i++) {
            result = students[i].magic + students[i].transgression ;
            max = students[0].magic + students[0].transgression ;
            if (result > max){
                name = students[i].getMag();
            }
        }
        System.out.println("Лучший студент Хогвартса - " +  name);
    }

    public void print (Hogwartz[]students) {
        for (int i = 0; i < students.length; i++) {
            Hogwartz hogwartz = students[i];
            System.out.println("Имя: " + hogwartz.getMag() +
                    "; Сила магии " + hogwartz.getMagic() +
                    "; Сила трансгресии " + hogwartz.getTransgression());
        }
        System.out.println();
    }

    public void print (Griffindor[]griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя: " + griffindor.getMag() +
                    ", благородство " + griffindor.getNobility() +
                    ", честь " + griffindor.getHonour() +
                    ", храбрость " + griffindor.getBravery());
        }
        System.out.println();
    }

    public void print (Slytherin[] slytherins){
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getMag()+
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
            System.out.println("Имя: " + hufflepuff.getMag()+
                    ", трудолюбивость "+ hufflepuff.getIndustriousness()+
                    ", верность " + hufflepuff.getLoyalty()+
                    ", честность " + hufflepuff.getHonesty());
        }
        System.out.println();
    }

    public void print (Ravenclaw[] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: "+ ravenclaw.getMag()+
                    ", разумность " + ravenclaw.getReasonableness()+
                    ", мудрость "+ ravenclaw.getWisdom()+
                    ", остроумие "+ ravenclaw.getWit()+
                    ", творчество "+ ravenclaw.getCreation());
        }
        System.out.println();
    }

}


