package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _5_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.printf("Hello, %s!",name);
    }
}
