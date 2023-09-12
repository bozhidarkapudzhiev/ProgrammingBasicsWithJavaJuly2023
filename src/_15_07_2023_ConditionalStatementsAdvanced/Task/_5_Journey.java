package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        String place="";
        String destination="";
        if (budget<=100){
            destination="Bulgaria";
            if (season.equals("summer")){
                budget=(budget*30/100);
                place="Camp";
            }else if (season.equals("winter")){
                budget=(budget*70/100);
                place="Hotel";
            }
        }else if (budget<=1000){
            destination="Balkans";
            if (season.equals("summer")){
                budget=(budget*40/100);
                place="Camp";
            } else if (season.equals("winter")) {
                budget=(budget*80/100);
                place="Hotel";
            }
        }else if (budget>1000){
            destination="Europe";
            budget=(budget*90/100);
            place="Hotel";

        }
        System.out.printf("Somewhere in %s\n%s - %.2f",destination,place,budget);
    }
}
