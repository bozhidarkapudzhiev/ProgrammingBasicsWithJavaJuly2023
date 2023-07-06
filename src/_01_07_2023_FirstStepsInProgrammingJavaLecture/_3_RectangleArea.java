package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _3_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        scanner.close();
        int resultArea=(a*b);
        System.out.print(resultArea);

    }
}
