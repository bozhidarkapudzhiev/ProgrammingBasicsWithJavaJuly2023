package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double trainingCostPerYear=Double.parseDouble(scanner.nextLine());
        double priceOfBasketballShoes=trainingCostPerYear-(trainingCostPerYear*40)/100.0;


        double priceOfABasketballTeamp=priceOfBasketballShoes-(priceOfBasketballShoes*20)/100;

        double costOfABasketball=(priceOfABasketballTeamp/4);

        double priceOfBasketballAccessories=(costOfABasketball/5);


        double totalPriceForTheEquipment=(trainingCostPerYear+priceOfBasketballShoes+priceOfABasketballTeamp+costOfABasketball+priceOfBasketballAccessories);
        System.out.println(totalPriceForTheEquipment);
    }
}
