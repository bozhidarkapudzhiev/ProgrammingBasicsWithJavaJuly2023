package _05_08_2023_NestedLoops.Task;

import java.util.Scanner;

public class _3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int primeNumSum=0;
        int nonPrimeNumSum=0;
        String input=scanner.nextLine();
        while (!"stop".equalsIgnoreCase(input)){
            int num=Integer.parseInt(input);

            if (num<0){
                System.out.println("Number is negative.");
                input=scanner.nextLine();
                continue;
            }

            boolean isPrimeNum=true;

            for (int i = 2; i <num ; i++) {
                if (num%i==0){
                    isPrimeNum=false;
                    break;
                }
            }
            if (isPrimeNum){
                primeNumSum+=num;
            }else {
                nonPrimeNumSum+=num;

            }

            input=scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d",primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d",primeNumSum);
    }
}
