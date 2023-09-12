package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _6_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        if ((n>=-100&&n<=100)&&n!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
