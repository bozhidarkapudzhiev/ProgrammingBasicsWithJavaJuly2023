package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _4_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        int numberOfFishermen=Integer.parseInt(scanner.nextLine());
        double rentalPrice=0;
       /* if (season.equals("Spring")){
            rentalPrice=3000;
        }else if (season.equals("Summer")||season.equals("Autumn")){
            rentalPrice=4200;
        } else if (season.equals("Winter")) {
            rentalPrice=2600;
        }*/
        switch (season){
            case "Spring":
                rentalPrice=3000;
                break;
            case "Summer":
            case "Autumn":
                rentalPrice=4200;
                break;
            case "Winter":
                rentalPrice=2600;
                break;
        }
        if (numberOfFishermen<=6){
            rentalPrice=rentalPrice-(rentalPrice*10/100);
        } else if (numberOfFishermen<=11) {
            rentalPrice=rentalPrice-(rentalPrice*15/100);
        } else {
            rentalPrice=rentalPrice-(rentalPrice*25/100);
        }
        if (numberOfFishermen%2==0&&!season.equals("Autumn")){
            rentalPrice=rentalPrice-(rentalPrice*5/100);
        }
       double price=(budget-rentalPrice);
        if (price>0){
            System.out.printf("Yes! You have %.2f leva left.",price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(price));
        }
    }
}
