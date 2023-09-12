package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _2_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees=Integer.parseInt(scanner.nextLine());
        String  timeOfDay=scanner.nextLine();
        String outfit="";
        String shoes="";

        /*if (degrees>=10&&degrees<18){
            switch (timeOfDay){
                case "Morning":
                    outfit="Sweatshirt";
                    shoes="Sneakers";
                    break;
                case "Afternoon":
                    outfit="shirt";
                    shoes="Moccasins";
                    break;
                case "Evening":
                    outfit="Shirt";
                    shoes="Moccasins";
                    break;
            }
        }else if (degrees>18&&degrees<=24){
            switch (timeOfDay){
                case "Morning":
                case"Evening":
                    outfit="Shirt";
                    shoes="Moccasins";
                    break;
                case "Afternoon":
                    outfit="T-Shirt";
                    shoes="Sandals";
                    break;

            }
        }else if (degrees>=25){
            switch (timeOfDay){
                case "Morning":
                    outfit="T-Shirt";
                    shoes="Sandals";
                    break;
                case"Afternoon":
                    outfit="Swim Suit";
                    shoes="Barefoot";
                    break;
                case "Evening":
                    outfit="Shirt";
                    shoes="Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
      */
        if (degrees>=10&&degrees<=18){
            if (timeOfDay.equals("Morning")){
                outfit="Sweatshirt";
                shoes="Sneakers";
            } else if (timeOfDay.equals("Afternoon")) {
                outfit="Shirt";
                shoes="Moccasins";
            }else if (timeOfDay.equals("Evening")){
                outfit=("Shirt");
                shoes="Moccasins";
            }
        }else if (degrees>18&&degrees<=24){
            if (timeOfDay.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (timeOfDay.equals("Afternoon")) {
                outfit="T-Shirt";
                shoes="Sandals";
        } else if (timeOfDay.equals("Evening")) {
                outfit="Shirt";
                shoes="Moccasins";
            }
        }else if (degrees>=25){
            if (timeOfDay.equals("Morning")){
                outfit="T-Shirt";
                shoes="Sandals";
            } else if (timeOfDay.equals("Afternoon")) {
                outfit="Swim Suit";
                shoes="Barefoot";
            }else if (timeOfDay.equals("Evening")){
                outfit="Shirt";
                shoes="Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);
    }
}
