package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _3_Deposit_Calculator {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

        double deposit=Double.parseDouble(scanner.nextLine());
        int period=Integer.parseInt(scanner.nextLine());
        double rate=Double.parseDouble(scanner.nextLine());

        double ratePeriod=(deposit*(rate/100))/12;
        double result=deposit+(period*ratePeriod);
        System.out.println(result);
    }
}
