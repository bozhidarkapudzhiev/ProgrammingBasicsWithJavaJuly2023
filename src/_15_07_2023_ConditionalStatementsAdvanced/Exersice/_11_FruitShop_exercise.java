package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _11_FruitShop_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String fruit = scanner.nextLine();
            String day = scanner.nextLine();
            double quantity = Double.parseDouble(scanner.nextLine());
            double price = 0;
            double weekendPrice = 0;
            boolean correctProduct = true;

            switch (fruit)
            {
                case "banana":
                    price = 2.5;
                    weekendPrice = 2.7;
                    break;
                case "apple":
                    price = 1.2;
                    weekendPrice = 1.25;
                    break;
                case "orange":
                    price = 0.85;
                    weekendPrice = 0.9;
                    break;
                case "grapefruit":
                    price = 1.45;
                    weekendPrice = 1.6;
                    break;
                case "kiwi":
                    price = 2.7;
                    weekendPrice = 3;
                    break;
                case "pineaple":
                    price = 5.5;
                    weekendPrice = 5.6;
                    break;
                case "grapes":
                    price = 3.85;
                    weekendPrice = 4.2;
                    break;
                default:
                    System.out.println("Error");
                    correctProduct = false;
                    break;

            }

            if (correctProduct == true)
            {
                switch (day)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        if (correctProduct == true)
                        {
                            System.out.printf("%.2f",(quantity*price));
                        }
                        break;
                    case "Saturday":
                    case "Sunday":
                        if (correctProduct == true)
                        {
                            System.out.printf("%.2f",(quantity*price));
                        }
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
        }

    }

