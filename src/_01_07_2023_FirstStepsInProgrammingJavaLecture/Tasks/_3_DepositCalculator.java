package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double amountDeposited =Double.parseDouble(scanner.nextLine());
       double termOfDeposit=Double.parseDouble(scanner.nextLine());
       double annualInterestRate=Double.parseDouble(scanner.nextLine());
       double interestRate =(amountDeposited*annualInterestRate)/100;
            interestRate=interestRate/12;
            amountDeposited=amountDeposited+(termOfDeposit*interestRate);
            System.out.println(amountDeposited);

    }
}