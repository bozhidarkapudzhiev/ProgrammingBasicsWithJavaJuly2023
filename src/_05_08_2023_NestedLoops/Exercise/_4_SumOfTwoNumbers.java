package _05_08_2023_NestedLoops.Exercise;

import java.util.Scanner;

public class _4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int end=Integer.parseInt(scanner.nextLine());
        int magicNumber=Integer.parseInt(scanner.nextLine());
        boolean isFoundValidCombination=false;
        int count=0;
        for (int firstNumber = start; firstNumber <=end ; firstNumber++) {
            for (int secondNum = start; secondNum <=end; secondNum++) {
              //  System.out.println(firstNumber+" "+secondNum);
                count++;
                int sum=firstNumber+secondNum;
                if (sum==magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,firstNumber,secondNum,magicNumber);
                   //Прекратяваме програмата
                    isFoundValidCombination=true;
                    break;
                }
            }
            if (isFoundValidCombination){
                break;
            }
        }
        if (!isFoundValidCombination){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }

    }
}
