package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        char operator=scanner.next().charAt(0);

        if(b==0 && (operator=='/'|| operator=='%')){
            System.out.printf("Cannot divide %d by zero",a);
        }else{
            double result = 0;
            switch (operator){
                case '*':
                    result=a*b;
                    break;
                case '/':
                    result=(double) a/b;
                    break;
                case '%':
                    result=a%b;
                    break;
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
            }
            if(operator=='*'||operator=='-'||operator=='+'){
                String evenOrOdd=result %2==0 ? "even":"odd";
                System.out.printf("%d %c %d = %.0f – %s",a,operator,b,result,evenOrOdd);
            } else if (operator=='/') {
                System.out.printf("%d/%d= %.2f",a,operator,b,result);
            }else if (operator=='%') {
                System.out.printf("%d/%d= %.0f", a, operator, b, result);
            }
        }
    }
}
