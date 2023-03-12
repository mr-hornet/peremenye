public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 3
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 3
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 3
        var weightFirthBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Общий вес бойцов = " + (weightSecondBoxer + weightFirthBoxer));
        System.out.println("Разница весов = " + (weightFirthBoxer - weightSecondBoxer));
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 3
        var weightFirthBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("1) Разница весов спортсменов = " + (weightSecondBoxer - weightFirthBoxer));
        System.out.println("2) Разница весов спортсменов = " + (weightSecondBoxer % weightFirthBoxer));
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 3
        var totalTime = 640;
        var oneWork = 8;
        var employees = totalTime / oneWork;
        System.out.println("Всего в компании = " + employees + " человек");
        employees = employees + 94;
        System.out.println("Если в компании работает "
                + employees + " человек, то всего " + (employees * oneWork)
                + " часов работы может быть поделено между сотрудниками");
    }

}