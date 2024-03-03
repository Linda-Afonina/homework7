public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int deposit = 15000;
        int capital = 0;
        int totalCapital = 2_459_000;
        int monthOfCapital = 0;

        while (capital < totalCapital) {
            monthOfCapital++;
            capital = deposit + capital + capital / 100;
            System.out.println("Месяц " + monthOfCapital + ", сумма накоплений равна " + capital + " рублей");
        }
        System.out.println(monthOfCapital + " месяцев потребуется, чтобы накопить более " + totalCapital + " рублей.");

        System.out.println("Задача 2.");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Задача 3.");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;
        while (year < 10) {
            year++;
            totalPopulation = totalPopulation + totalPopulation * (birthRate - deathRate) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
        }

        System.out.println("Задача 4.");
        int vasilijCapital = 15000;
        int vasilijTotalCapital = 12_000_000;
        int month = 0;
        while (vasilijCapital < vasilijTotalCapital) {
            month++;
            vasilijCapital = vasilijCapital + vasilijCapital * 7 / 100;
            System.out.println("Месяц " + month + ", сумма накоплений " + vasilijCapital + " рублей");
        }

        System.out.println("Задача 5.");
        vasilijCapital = 15000;
        month = 0;
        while (vasilijCapital < vasilijTotalCapital) {
            month++;
            vasilijCapital = vasilijCapital + vasilijCapital * 7 / 100;
            if (month % 6 != 0) {
                continue;
            }
            System.out.println("Месяц " + month + ", сумма накоплений " + vasilijCapital + " рублей");
        }

        System.out.println("Задача 6.");
        vasilijCapital = 15000;
        for (int i = 1; i <= 9 * 12; i++) {
            vasilijCapital = vasilijCapital + vasilijCapital * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + vasilijCapital + " рублей");
            }
        }

        System.out.println("Задача 7.");
        int dateOfMarch = 1;
        do {
            System.out.println("Сегодня пятница, " + dateOfMarch + "-е число. Необходимо подготовить отчет");
            dateOfMarch = dateOfMarch + 7;
        }
        while (dateOfMarch <= 31);

        System.out.println("Задача 8.");
        int actualYear = 2024;
        int yearsAgo = actualYear - 200;
        int yearsAhead = actualYear + 100;
        for (int yearWithComet = 0; yearWithComet <= yearsAhead; yearWithComet = yearWithComet + 79) {
            if (yearWithComet < yearsAgo) {
                continue;
            }
            System.out.println(yearWithComet);
        }


    }
}