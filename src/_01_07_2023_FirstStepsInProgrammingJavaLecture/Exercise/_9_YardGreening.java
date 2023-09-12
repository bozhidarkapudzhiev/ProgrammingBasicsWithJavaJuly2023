package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters=Double.parseDouble(scanner.nextLine());
        double price=(squareMeters*7.61);
        double discount=price*18/100;
        price=price-discount;
        System.out.printf("The final price is: %.2f lv.\nThe discount is: %.2f lv.",price,discount);
    }
}
