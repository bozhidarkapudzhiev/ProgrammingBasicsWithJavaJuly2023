package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountОfDogFood;
        int amountOfCatFood;
        double unitPriceDogFood=2.50;
        double unitPriceCatFood=4.0;
        amountОfDogFood=Integer.parseInt(scanner.nextLine());
        amountOfCatFood=Integer.parseInt(scanner.nextLine());
        double totalAmountUnitPriceDogPrice=(amountОfDogFood*unitPriceDogFood);
        double totalAmountUnitPriceCatPrice=(amountOfCatFood*unitPriceCatFood);
        double priceTotalAmountAll=totalAmountUnitPriceDogPrice+totalAmountUnitPriceCatPrice;
        System.out.println(priceTotalAmountAll);
    }
}
