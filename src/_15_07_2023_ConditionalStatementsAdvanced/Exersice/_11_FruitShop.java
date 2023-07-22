package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String weekOfDay = scanner.nextLine();
        double price = 0;
        int quantity = Integer.parseInt(scanner.nextLine());
        String weekOfDays = weekOfDay;

        if (weekOfDays.equals("Monday") || weekOfDay.equals("Tuesday")
                || weekOfDay.equals("Wednesday") || weekOfDay.equals("Thursday")
                || weekOfDay.equals("Friday")) {
            if (fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") ||
                    fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("kiwi")) {
                switch (fruit) {
                    case "banana":
                        if (fruit.equals("banana")) {
                            price = 2.50;
                        }
                    case "apple":
                        if (fruit.equals("apple")) {
                            price = 1.20;
                        }
                    case "orange":
                        if (fruit.equals("orange")) {
                            price = 0.85;
                        }
                    case "grapefruit":
                        if (fruit.equals("grapefruit")) {
                            price = 1.45;
                        }
                    case "kiwi":
                        if (fruit.equals("kiwi")) {
                            price = 2.70;
                        }
                    case "pineapple":
                        if (fruit.equals("pineapple")) {
                            price = 5.50;
                        }
                    case "grapes":
                        if (fruit.equals("grapes")) {
                            price = 3.85;
                        }


                }
                double finalePrice = quantity * price;
                System.out.printf("%.2f", finalePrice);
            } else if (weekOfDays.equals("Saturday") || (weekOfDay.equals("Sunday"))) {
                switch (fruit) {
                    case "banana":
                        if (fruit.equals("banana")) {
                            price = 2.70;
                        }
                    case "apple":
                        if (fruit.equals("apple")) {
                            price = 1.25;
                        }
                    case "orange":
                        if (fruit.equals("orange")) {
                            price = 0.90;
                        }
                    case "grapefruit":
                        if (fruit.equals("grapefruit")) {
                            price = 1.60;
                        }
                    case "kiwi":
                        if (fruit.equals("kiwi")) {
                            price = 3.00;
                        }
                    case "pineapple":
                        if (fruit.equals("pineapple")) {
                            price = 5.60;
                        }
                    case "grapes":
                        if (fruit.equals("grapes")) {
                            price = 4.20;
                        }
                }
                double finalePrice = quantity * price;
                System.out.printf("%.2f", finalePrice);
            } else {
                System.out.println("error");
            }
        }
    }
}


