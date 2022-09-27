public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int contribution=15000;
        int total=0;
        int month=1;
        while (total<2_459_000)  {
            total += contribution+total*0.01;

            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
            month++;
        }

        System.out.println("Задача 2");
        int i=1;
        while (i<=10)  {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (int n=10; n>=1; n--) {
            System.out.print(n+" ");
        }
        System.out.println();


        System.out.println("Задача 3");
        int population = 12_000_000;
        float birth = 17/1000f;
        float death = 8/1000f;
        for (int m=1; m<11; m++) {
            population=population +Math.round(population*birth)-Math.round(population*death);
            System.out.println("Год "+m+", численность населения составляет "+ population);
        }
    }
}