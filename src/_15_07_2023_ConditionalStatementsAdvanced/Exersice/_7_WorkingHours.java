package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _7_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String daysWorking = scanner.nextLine();

            switch (daysWorking) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    if (hour >= 10 && hour <= 18) {
                        System.out.println("open");
                    } else {
                        System.out.println("closed");
                    }
                    break;
                case "Sunday":
                    System.out.println("closed");
            }

        }

    }


