package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _3_EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        n%=2;
        if (n==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
