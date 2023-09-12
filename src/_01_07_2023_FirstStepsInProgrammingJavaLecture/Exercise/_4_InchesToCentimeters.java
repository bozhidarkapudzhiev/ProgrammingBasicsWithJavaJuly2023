package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _4_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n=Double.parseDouble(scanner.nextLine());
        double inch=n*2.54;
        System.out.println(inch);
    }
}
