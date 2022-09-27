package lesson3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int currentYear = 2022;
        int firstYear = currentYear - 200;
        int lastYear = currentYear + 100;
        for (int i = firstYear; i <= lastYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Задание 2");
        for (int n=1; n<=10; n++) {
            System.out.println("2*"+n+"="+n*2);
        }
    }
}
