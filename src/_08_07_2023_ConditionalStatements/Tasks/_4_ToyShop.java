package _08_07_2023_ConditionalStatements.Tasks;

import java.beans.Introspector;
import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerExcursion=Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles=Integer.parseInt(scanner.nextLine());
        int numberOfDolls=Integer.parseInt(scanner.nextLine());
        int numberOfBears=Integer.parseInt(scanner.nextLine());
        int numberOfMinions=Integer.parseInt(scanner.nextLine());
        int numberOfTrucks=Integer.parseInt(scanner.nextLine());

        double priceOfPuzzles=numberOfPuzzles*2.60;
        double priceOfDolls=numberOfDolls*3.00;
        double priceOfBears=numberOfBears*4.10;
        double priceOfMinions=numberOfMinions*8.20;
        double priceOfTrucks=numberOfTrucks*2.00;

        double allPrice = priceOfPuzzles+priceOfDolls+priceOfBears+priceOfMinions+priceOfTrucks;
        int allQuantityToys=numberOfPuzzles+numberOfDolls+numberOfBears+numberOfMinions+numberOfTrucks;
        if (allQuantityToys>=50){
           allPrice=allPrice-(allPrice*25/100);
        }
        double rent =allPrice*10/100;
        allPrice-=rent;
        double moneyLeftOver=Math.abs(allPrice-pricePerExcursion);

        if (pricePerExcursion<allPrice){
            System.out.printf("Yes! %.2f lv left.",moneyLeftOver);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",moneyLeftOver);
        }

    }
}

