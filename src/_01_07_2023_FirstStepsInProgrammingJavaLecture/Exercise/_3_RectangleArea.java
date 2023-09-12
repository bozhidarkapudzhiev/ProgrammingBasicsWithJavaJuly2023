package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _3_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        int area=length*height;
        System.out.println(area);
    }
}
