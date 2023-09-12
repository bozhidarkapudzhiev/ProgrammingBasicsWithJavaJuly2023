package _08_07_2023_ConditionalStatements.Tasks;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int videoCard=Integer.parseInt(scanner.nextLine());
        int processor=Integer.parseInt(scanner.nextLine());
        int ramMemory=Integer.parseInt(scanner.nextLine());

        double priceVideoCard=videoCard*250.00;
        double priceProcessor=processor*(priceVideoCard*35/100);
        double priceRamMemory=ramMemory*(priceVideoCard*10/100);

        double allPrice=priceVideoCard+priceProcessor+priceRamMemory;
        double discount=0;

        if (videoCard>processor){
            discount=allPrice*15/100;
            allPrice-=discount;
        }
      budget=budget-allPrice;
        if (budget<0){
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget));
        }else {
            System.out.printf("You have %.2f leva left!",budget);
        }

    }
}
