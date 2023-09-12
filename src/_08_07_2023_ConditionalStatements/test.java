package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int a=n%100;
        int b=n%10;
        if (n==5){
            System.out.println("Add 5 bonus score");
        }else {
            System.out.println();
        }

    }
}
