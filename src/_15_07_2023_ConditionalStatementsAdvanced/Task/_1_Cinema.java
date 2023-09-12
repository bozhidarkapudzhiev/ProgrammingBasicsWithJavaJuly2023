package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProject=scanner.nextLine();
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        double price=r*c;
        if (typeProject.equals("Premiere")){
            price*=12.00;
        }else if (typeProject.equals("Normal")){
            price*=7.50;
        } else if (typeProject.equals("Discount")) {
            price*=5.00;
        }
        System.out.printf("%.2f leva",(price));
    }
}
