package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _1_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd=Double.parseDouble(scanner.nextLine());
        double bgn= (usd*1.79549);
        System.out.println(bgn);
    }
}
