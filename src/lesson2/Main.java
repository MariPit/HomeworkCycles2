package lesson2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int total = 15_000;
        int month = 1;
        while (total < 12_000_000) {
            total += total * 0.07;
            System.out.println(month + " месяц - " + total + " руб.");
            month++;}

        System.out.println("Задача 2");
        int total2 = 15_000;
        int month2 = 1;
        while (total2 < 12_000_000) {
            total2 += total2 * 0.07;
            if (month2 % 6 == 0)
                System.out.println(month2 + " месяц - " + total2 + " руб.");
            month2++;}

        System.out.println("Задача 3");
        int total3 = 15_000;
        int month3 = 1;
        while (month3 < 9*12) {
            total3 += total3 * 0.07;
            if (month3 % 6 == 0)
                System.out.println(month3 + " месяц - " + total3 + " руб.");
            month3++;}

        System.out.println("Задача 4");
        for (int friday = 2; friday <31; friday+=7)
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
    }
}
