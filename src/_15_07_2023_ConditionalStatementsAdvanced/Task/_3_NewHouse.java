package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kindOfFlowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        /*roses dahlias tulips narcissus gladioli**/
        double prices=0;
        switch (kindOfFlowers){
            case "Roses":
                prices=numberOfFlowers*5.00;
                if (numberOfFlowers>80){
                    prices=prices-(prices*10/100);
                }
                break;
            case "Dahlias":
                prices=numberOfFlowers*3.80;
                if (numberOfFlowers>90){
                    prices=prices-(prices*15/100);
                }
                break;
            case "Tulips":
                prices=numberOfFlowers*2.80;
                if (numberOfFlowers>80){
                    prices=prices-(prices*15/100);
                }
                break;
            case "Narcissus":
                prices=numberOfFlowers*3.00;
                if (numberOfFlowers<120){
                    prices=prices+(prices*15/100);
                }
                break;
            case "Gladiolus":
                prices=numberOfFlowers*2.50;
                if (numberOfFlowers<80){
                    prices=prices+(prices*20/100);
                }
                break;
        }
       double finalPrice=Math.abs(budget-prices);
        if (prices<=budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,kindOfFlowers,finalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(finalPrice));
        }
    }
}
