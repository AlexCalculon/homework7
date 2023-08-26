import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int balance = 0;
        int mont = 0;
        while (balance <= 2_459_000) {
            balance += 1500;
            ++mont;
        }
        System.out.println("Месяц " + mont + ", сумма накопленная равна " + balance + " рублей");


        //task2
        System.out.println("task2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        //task3
        System.out.println("task3");
        int population = 12_000_000;
        int fertylity = 17;
        int mortality = 8;

        for (int j = 1; j <= 10; j++) {
            population += population / 1000 * (fertylity - mortality);
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }

        System.out.println();


        //task4
        System.out.println("task4");
        balance = 0;
        mont = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++mont;
            System.out.println("Месяц " + mont + ", сумма накопленная равна " + balance + " рублей");
        }
        System.out.println();


        //task5
        System.out.println("task5");
        balance = 0;
        mont = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++mont;

            if (mont % 6 == 0) {
                System.out.println("Месяц " + mont + ", сумма накопленная равна " + balance + " рублей");
            }
        }
        //task6
        System.out.println("task6");
        balance = 0;
        for (int j = 1; j <= 9 * 12; j++) {
            balance += 15000;
            balance += 1.07;

            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накопленная равна " + balance + " рублей");
            }

        }

        //task7
        System.out.println("task7");
        for (int friday = 3; friday <= 31; friday += 7){
            System.out.println("Сегодня пятница, " + friday + "-е число, необходимо подготовить отчет");
            }

        //task8
        System.out.println("task8");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int j = startYear; j <= endYear ; j++) {
            if (j % 79 == 0);
            System.out.println(j);
            
        }
    }
}
    




