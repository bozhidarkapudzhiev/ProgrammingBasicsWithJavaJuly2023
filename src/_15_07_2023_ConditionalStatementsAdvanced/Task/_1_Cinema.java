package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectType=scanner.nextLine();
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        int seats=r*c;
        double ticketPrice;
        switch (projectType){
            case "Premiere":
                ticketPrice=12.0;
                break;
            case "Normal":
                ticketPrice=7.5;
                break;
            case "Discount":
                ticketPrice=5.0;
                break;
            default:
                ticketPrice=0.0;
                break;
        }
        double profit=seats*ticketPrice;
        System.out.printf("%.2f leva",profit);
    }
}
