public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper =paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - (int)3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var boxersWeight1 = 78.2;
        var boxersWeight2 = 82.7;
        var totalWeight = boxersWeight1 + boxersWeight2; // Общий вес бойцов
        var differenceWeight = boxersWeight2 - boxersWeight1; // Разница между весами бойцов (Вычитание из большего веса меньшего)
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        // Задача 7
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг"); // Разница между весами бойцов (Вычитание из большего веса меньшего)
        var divisionWeight = boxersWeight2 % boxersWeight1; // Разница между весами бойцов (Используя функцию остаток от деления)
        System.out.println("Разница между весами бойцов " + divisionWeight + " кг");

        // Задача 8
        var totalTime = 640;
        var workHour = 8;
        var countWorker = totalTime / workHour;
        var newWorker = 94;
        var newCountWorker = countWorker + newWorker;
        var timeWorker = totalTime / newCountWorker;
        System.out.println("Всего работников в компании – " + countWorker + " человек");
        System.out.println("Если в компании работает " + newCountWorker + " человек, то всего " + timeWorker + " часов работы может быть поделено между сотрудниками");
    }
}