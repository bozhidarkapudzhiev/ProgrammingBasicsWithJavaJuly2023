package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String currentDay="Monday";
        double salary=0;
        if (currentDay.equals("Monday")){
            salary=Double.parseDouble(scanner.nextLine());
        }
        System.out.println(salary);
    }
}
