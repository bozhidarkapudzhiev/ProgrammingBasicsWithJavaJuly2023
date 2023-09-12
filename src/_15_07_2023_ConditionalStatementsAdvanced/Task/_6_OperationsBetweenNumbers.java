package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.next().charAt(0);
        double result = 0;
        if (n2==0) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else if  (operator == '+' || operator == '-' || operator == '*') {
        if (operator == '+') {
            result = n1 + n2;
        } else if (operator == '-') {
            result = n1 - n2;
        } else {
            result = n1 * n2;
        }
        System.out.printf("%d %c %d = %.0f - ", n1, operator, n2, (result));
        if (result % 2 == 0) {
            System.out.print("even");
        } else {
            System.out.print("odd");
        }
    } else if (operator == '/') {
        result = (double) n1 / n2;
        System.out.printf("%d %c %d = %.2f ", n1, operator, n2, (result));
    } else if (operator == '%') {
        result = n1 % n2;
        System.out.printf("%d %c %d = %.0f ", n1, operator, n2, (result));
    }

}

    }

