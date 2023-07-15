package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int videoCard =Integer.parseInt(scanner.nextLine());
        int processor =Integer.parseInt(scanner.nextLine());
        int ramMemory=Integer.parseInt(scanner.nextLine());
        double priceVideoCard=250.0*videoCard;
        double priceProccesor=(priceVideoCard*35/100)*processor;
        double priceRamMemory=(priceVideoCard*10/100)*ramMemory;
        double priceAllProduct=(priceVideoCard+priceProccesor+priceRamMemory);

        double discount=priceAllProduct*15/100;
        double finalePrice=priceAllProduct-discount;
        double remainder= Math.abs(budget-finalePrice);

        if (finalePrice<=budget){
            System.out.printf("You have %.2f leva left!",remainder);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",remainder);
        }

    }
}
