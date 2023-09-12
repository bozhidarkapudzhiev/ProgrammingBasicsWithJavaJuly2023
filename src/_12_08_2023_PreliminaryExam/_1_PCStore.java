package _12_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _1_PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForProcessor = Double.parseDouble(scanner.nextLine());
        double priceForVideoCard = Double.parseDouble(scanner.nextLine());
        double priceForOneRamMemory = Double.parseDouble(scanner.nextLine());
        int numbersOfRamMemory = Integer.parseInt(scanner.nextLine());
        double percentageDiscount = Double.parseDouble(scanner.nextLine());

        priceForProcessor=(priceForProcessor*1.57);
        priceForVideoCard=(priceForVideoCard*1.57);
        priceForOneRamMemory=(priceForOneRamMemory*1.57)*numbersOfRamMemory;

        priceForProcessor=priceForProcessor-(priceForProcessor*percentageDiscount/100);
        priceForVideoCard=priceForVideoCard-(priceForVideoCard*percentageDiscount/100);
        double allPrice=(priceForProcessor+priceForVideoCard+priceForOneRamMemory);
        System.out.println(allPrice);

    }
}