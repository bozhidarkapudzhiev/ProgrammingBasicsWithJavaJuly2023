package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityDogFood=Integer.parseInt(scanner.nextLine());
        int quantityCatFood=Integer.parseInt(scanner.nextLine());
        double priceDogFood=quantityDogFood*2.50;
        double priceCatFood=quantityCatFood*4.00;
        double finalePrice=priceDogFood+priceCatFood;
        System.out.printf("%.1f lv.",finalePrice);

    }
}
