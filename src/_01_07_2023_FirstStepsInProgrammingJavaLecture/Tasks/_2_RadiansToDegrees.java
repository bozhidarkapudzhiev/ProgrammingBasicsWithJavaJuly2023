package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radian=Double.parseDouble(scanner.nextLine());
        double degrees=radian*180/Math.PI;
        System.out.println(degrees);
    }
}
