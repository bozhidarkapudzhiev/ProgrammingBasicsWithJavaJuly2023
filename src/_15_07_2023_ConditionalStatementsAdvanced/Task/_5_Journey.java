package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budge = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price=0;
        String destination="";
        if (budge <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budge * 30 / 100;
            } else if (season.equals("winter")) {
                price = budge * 70 / 100;
            }
        } else if (budge <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budge * 40 / 100;
            } else if (season.equals("winter")) {
                price = budge * 80 / 100;
            }

        } else if (budge > 1000) {
            destination = "Europe";
            price = budge * 90 / 100;
        }
        String  type="";
        if (season.equals("winter")||destination.equals("Europe")) {
            type="Hotel";
        }else {
            type="Camp";
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",type,price);
    }
}
