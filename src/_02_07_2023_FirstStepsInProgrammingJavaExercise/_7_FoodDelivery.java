package _02_07_2023_FirstStepsInProgrammingJavaExercise;

import java.util.Scanner;

public class _7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfChickenMenus = Integer.parseInt(scanner.nextLine());
        int numberOfFishMenus=Integer.parseInt(scanner.nextLine());
        int numberOfVegetarianMenus=Integer.parseInt(scanner.nextLine());

        double numberOfChickenMenusPrice=numberOfChickenMenus*10.35;
        double numberOfFishMenusPrice=numberOfFishMenus*12.40;
        double numberOfVegetarianMenusPrice=numberOfVegetarianMenus*8.15;
        double total=(numberOfChickenMenusPrice+numberOfFishMenusPrice+numberOfVegetarianMenusPrice);


        double dessertPrice=(total*20/100);
        double deliveryAmount=2.50;
        double allTotal=total+dessertPrice+deliveryAmount;
        System.out.println("Total="+allTotal);



    }
}
