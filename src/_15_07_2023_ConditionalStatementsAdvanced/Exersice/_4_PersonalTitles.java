package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _4_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        if (age >= 16) {
            if (gender == 'm') {
                System.out.println("Mr.");
            }
        }
            if (age < 16) {
                if (gender == 'm') {
                    System.out.println("Master");
                }
            }
        if (age >= 16) {
            if (gender == 'f') {
                System.out.println("Ms.");
            }
        }
        if (age < 16) {
            if (gender == 'f') {
                System.out.println("Miss");
            }
        }
        }

    }

