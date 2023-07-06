package _02_07_2023_FirstStepsInProgrammingJavaExercise;

import java.util.Scanner;

public class _1_Covertion_USD_To_BGN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double usd=Double.parseDouble(scanner.nextLine());
        double bgn=usd*1.79549;
        System.out.println(bgn);
    }
}
