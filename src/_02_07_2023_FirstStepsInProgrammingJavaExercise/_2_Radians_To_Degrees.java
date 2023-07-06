package _02_07_2023_FirstStepsInProgrammingJavaExercise;

import java.util.Scanner;

public class _2_Radians_To_Degrees {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radians=Double.parseDouble(scanner.nextLine());
        double degress=radians*180/Math.PI;
        System.out.println(degress);
    }
}
