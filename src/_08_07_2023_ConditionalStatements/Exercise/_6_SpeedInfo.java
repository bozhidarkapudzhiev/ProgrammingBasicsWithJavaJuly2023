package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _6_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n =Double.parseDouble(scanner.nextLine());
        if (n<=10){
            System.out.println("slow");
        } else if (n<=50) {
            System.out.println("average");
        } else if (n<=150) {
            System.out.println("fast");
        } else if (n<=1000) {
            System.out.println("ultra fast");
        }else if (n>1000) {
            System.out.println("extremely fast");
        }
    }
}
