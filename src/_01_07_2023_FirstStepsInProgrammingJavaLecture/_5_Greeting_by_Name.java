package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _5_Greeting_by_Name {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Hello, "+name+"!");
    }
}
