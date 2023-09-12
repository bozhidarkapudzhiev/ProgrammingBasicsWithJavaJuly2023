package _29_07_2023_WhileLoop.Exercise;

import java.util.Scanner;

public class _5_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paymont=scanner.nextLine();
        double sum=0;
        while (!paymont.equals("NoMoreMoney")){
            if (Double.parseDouble(paymont)<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",Double.parseDouble(paymont));
            sum+=Double.parseDouble(paymont);
            paymont=scanner.nextLine();
        }
        System.out.printf("Total:%.2f%n",sum);
    }
}
