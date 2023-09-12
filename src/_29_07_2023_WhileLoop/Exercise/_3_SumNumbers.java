package _29_07_2023_WhileLoop.Exercise;

import java.util.Scanner;

public class _3_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n=Integer.parseInt(scanner.nextLine());
       int sum=0;
       while (sum<n){
           int number=Integer.parseInt(scanner.nextLine());
           sum+=number;
           if (sum==n){
               break;
           }
       }
        System.out.println(sum);
    }
}
