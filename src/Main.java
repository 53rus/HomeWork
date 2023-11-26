public class Main {
    public static void main(String[] args) {
        var dog = 8d;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " собака");
        System.out.println(cat + " кот");
        System.out.println(paper + " бумага");

        dog = dog + 4 ;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " собака +4");
        System.out.println(cat + " кот +4");
        System.out.println(paper + " бумага +4");

        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper-7639;

        System.out.println(dog + " собака -3.5");
        System.out.println(cat + " кот 1.6");
        System.out.println(paper + " бумага -7639");

        var friends = 19;
        System.out.println(friends + " присвоенное значение");
        friends = friends + 2;
        System.out.println(friends + " ответ +2");
        friends = (friends + 2) / 7;
        System.out.println(friends + " ответ (+2 /7)");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println(boxersWeight + " Общая масса двух бойцов");
        System.out.println(differenceWeight + " Разница межуду массами бойцов");
        var difference2Weight = boxer2Weight % boxer1Weight;
        System.out.println(differenceWeight + " Разница межуду массами бойцов вычисленна с помощью деления с остатком");

        var totalHours = 640;
        var worktimeHours = 8;
        var quantityWorker = (totalHours / worktimeHours);
        System.out.println("Всего работников в компании" + quantityWorker + " человек");
        var workers = 94;
        var worktime1Hours = (totalHours / workers);
        System.out.println("Если в компании работает " + workers + " человек, то всего" + worktime1Hours + " часов работы может быть поделено между сотрудниками");








    }
}