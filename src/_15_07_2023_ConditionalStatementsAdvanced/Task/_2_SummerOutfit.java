package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _2_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees=Integer.parseInt(scanner.nextLine());
        String timeOfDay=scanner.nextLine();

        boolean cold=degrees>=10&&degrees<=18;
        boolean warm=degrees>18&&degrees<=24;
        boolean hot=degrees>=25;

   //     String demo="Sweatshirt";

        String outfit="";
        String shoes="";

        switch (timeOfDay){
            case "Morning":
                if(cold){
                    outfit="Sweatshirt";
                    shoes="Sneakers";
                }else if(warm){
                    outfit="Shirt";
                    shoes="Moccasins";
                }else  if(hot){
                    outfit="T-Shirt";
                    shoes="Sandals";
                }
                break;
            case "Afternoon":
                if(cold){
                    outfit="Shirt";
                    shoes="Moccasins";
                }else if(warm){
                    outfit="T-Shirt";
                    shoes="Sandals";
                }else  if(hot){
                    outfit="Swim Suit";
                    shoes="Barefoot";
                }
                break;
            case "Evening":
                if(cold||warm||hot){
                    outfit="Shirt";
                    shoes="Moccasins";
                    break;
                }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,outfit,shoes);

    }
}
