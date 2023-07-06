package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _6_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String fName=scanner.nextLine();

        String lName=scanner.nextLine();

        int age=Integer.parseInt(scanner.nextLine());

        String towm=scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",
                fName,lName,age,towm);
    }
}
