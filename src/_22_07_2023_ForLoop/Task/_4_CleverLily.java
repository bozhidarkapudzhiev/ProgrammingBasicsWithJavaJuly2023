package _22_07_2023_ForLoop.Task;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        double washingMachinePrice=Double.parseDouble(scanner.nextLine());
        double toysPrice=Double.parseDouble(scanner.nextLine());

        double sum=0;


        for (int currentAge=1;currentAge<=age;currentAge++){
            if (currentAge%2==0){
                sum+=(((double) currentAge/2)*10)-1;
            }else{
                sum+=toysPrice;
            }
        }
        double diff=Math.abs(sum-washingMachinePrice);
        if (sum>=washingMachinePrice){
        System.out.printf("Yes! %.2f",diff);
    }else {
        System.out.printf("No! %.2f",diff);
    }
    }
}
