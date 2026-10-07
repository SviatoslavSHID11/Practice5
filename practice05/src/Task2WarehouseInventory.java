// Task2WarehouseInventory.java
package semester1.practice05.homework;

public class Task2WarehouseInventory {
    public static void main(String[] args) {
        // товари на складі
        String[] items = new String[5];
        items[0] = "Ноутбук";
        items[1] = "Смартфон";
        items[2] = "Бездротові навушники";
        items[3] = "Механічна клавіатура";
        items[4] = "Монітор 27\"";

        // скільки одиниць кожного товару
        int[] quantities = new int[5];
        quantities[0] = 8;
        quantities[1] = 3;
        quantities[2] = 25;
        quantities[3] = 4;
        quantities[4] = 12;

        // ціна за одиницю
        double[] prices = new double[5];
        prices[0] = 28500.0;
        prices[1] = 19200.0;
        prices[2] = 1850.0;
        prices[3] = 3100.0;
        prices[4] = 9400.0;

        // тут будемо зберігати вартість по кожному товару
        double[] totals = new double[5];

        double warehouseSum = 0;
        int bestItem = 0;
        int i;

        // рахуємо вартість кожного товару і шукаємо найдорожчий
        for (i = 0; i < 5; i++) {
            totals[i] = quantities[i] * prices[i];
            warehouseSum = warehouseSum + totals[i];

            if (totals[i] > totals[bestItem]) {
                bestItem = i;
            }
        }

        System.out.println("=================== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===================");
        System.out.println("№ | Товар | К-сть | Ціна (грн) | Вартість (грн)");
        System.out.println("----------------------------------------------------------------");

        for (i = 0; i < 5; i++) {
            System.out.println((i + 1) + " | " + items[i] + " | "
                    + quantities[i] + " | " + prices[i] + " | " + totals[i]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Загальна вартість складу: " + warehouseSum + " грн");
        System.out.println("Найбільше грошей вкладено в: " + items[bestItem]
                + " (" + totals[bestItem] + " грн)");

        System.out.println();
        System.out.println("ДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.):");

        boolean findDeficit = false;
        for (i = 0; i < 5; i++) {
            if (quantities[i] < 5) {
                System.out.println("- " + items[i] + " (залишилось "
                        + quantities[i] + " шт.) -> треба дозамовити!");
                findDeficit = true;
            }
        }

        if (findDeficit == false) {
            System.out.println("Дефіцитних позицій немає.");
        }

        System.out.println("================================================================");
    }
}
