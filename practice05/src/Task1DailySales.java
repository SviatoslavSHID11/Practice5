// Task1DailySales.java
package semester1.practice05.homework;

import java.util.Scanner;

public class Task1DailySales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // дні тижня записую окремо, бо так на парі показували
        String[] days = new String[7];
        days[0] = "Понеділок";
        days[1] = "Вівторок";
        days[2] = "Середа";
        days[3] = "Четвер";
        days[4] = "П'ятниця";
        days[5] = "Субота";
        days[6] = "Неділя";

        double[] sales = new double[7];
        int i;

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");

        // вводимо виторг за кожен день
        for (i = 0; i < 7; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = sc.nextDouble();
        }

        // рахуємо суму
        double sum = 0;
        for (i = 0; i < 7; i++) {
            sum = sum + sales[i];
        }

        double average = sum / 7;

        // шукаємо найкращий і найгірший день
        int bestDay = 0;
        int worstDay = 0;
        for (i = 1; i < 7; i++) {
            if (sales[i] > sales[bestDay]) {
                bestDay = i;
            }
            if (sales[i] < sales[worstDay]) {
                worstDay = i;
            }
        }

        System.out.println();
        System.out.println("---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + sum + " грн");
        System.out.println("Середній виторг на день: " + average + " грн");
        System.out.println("Найкращий день: " + days[bestDay] + " (" + sales[bestDay] + " грн)");
        System.out.println("Найгірший день: " + days[worstDay] + " (" + sales[worstDay] + " грн)");

        System.out.println();
        System.out.println("Дні з виторгом вище середнього:");
        for (i = 0; i < 7; i++) {
            if (sales[i] > average) {
                System.out.println("- " + days[i] + ": " + sales[i] + " грн");
            }
        }

        System.out.println("==========================================");

        sc.close();
    }
}
