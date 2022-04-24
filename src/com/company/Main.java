package com.company;

import com.company.objectOrientedProgramming.*;

public class Main {

    public static void main(String[] args) {

        Hogwartz[] students = {
                new Hogwartz("Гарри Поттер", 80, 80),
                new Hogwartz("Гермиона Грейнджер", 90, 90),
                new Hogwartz("Рон Уизли", 60, 40),
                new Hogwartz("Драко Малфой", 75, 95),
                new Hogwartz("Грэхэм Монтегю", 50, 70),
                new Hogwartz("Грегори Гойл", 50, 65),
                new Hogwartz("Захария Смит", 60, 50),
                new Hogwartz("Седрик Диггори", 80, 60),
                new Hogwartz("Джастин Финч-Флетчли", 50, 50),
                new Hogwartz("Чжоу Чанг", 55, 55),
                new Hogwartz("Падма Патил", 60, 55),
                new Hogwartz("Маркус Белби", 45, 55)
        };

        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 80, 80, 9, 9, 10),
                new Griffindor("Гермиона Грейнджер", 90, 90, 5, 5, 6),
                new Griffindor("Рон Уизли", 60, 40, 3, 6, 5)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 75, 95, 8, 8, 10, 5, 10),
                new Slytherin("Грэхэм Монтегю", 50, 70, 6, 4, 5, 5, 7),
                new Slytherin("Грегори Гойл", 50, 65, 7, 5, 6, 5, 7)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 60, 50, 7, 5, 6),
                new Hufflepuff("Седрик Диггори", 80, 60, 6, 7, 8),
                new Hufflepuff("Джастин Финч-Флетчли", 50, 50, 5, 5, 6)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 55, 55, 7, 6, 7, 5),
                new Ravenclaw("Падма Патил", 60, 55, 6, 5, 7, 4),
                new Ravenclaw("Маркус Белби", 45, 55, 7, 7, 6, 6)
        };

        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(griffindors);
        printService.print(slytherins);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);


    }
}
