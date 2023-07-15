package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int barbies = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int tracks = Integer.parseInt(scanner.nextLine());

        int numOfToys = puzzles + barbies + bears + minions + tracks;

        double profit = (puzzles * 2.60) + (barbies * 3) + (bears * 4.10) + (minions * 8.20) + (tracks * 2);
        profit = profit - profit * 10 /100;

        if (numOfToys >= 50) {
            profit = profit - profit * 25 / 100;
        }

        double result = Math.abs(profit - tripPrice);

        if (tripPrice > profit) {
            System.out.printf("Not enough money! %.2f lv needed.", result);
        } else {
            System.out.printf("Yes! %.2f lv left.", result);
        }


    }
}