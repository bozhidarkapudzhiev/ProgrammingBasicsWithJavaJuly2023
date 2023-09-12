package _05_08_2023_NestedLoops.Task;

import java.util.Scanner;

public class _2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN=Integer.parseInt(scanner.nextLine());
        int secondN=Integer.parseInt(scanner.nextLine());
        for (int i = firstN; i <=secondN; i++) {
          //  String currentNum=String.valueOf(i);
            int currentNum=i;

            int evenSum=0;
            int oddSum=0;
            for (int j =String.valueOf(i).length(); j >0 ; j--) {
               // int digit= Integer.parseInt(String.valueOf(currentNum.charAt(j)));

                int lastDigit=currentNum%10;

                currentNum/=10;

                if (j%2==0){
                    evenSum+=lastDigit;
                }else {
                    oddSum+=lastDigit;
                }
            }
            if (evenSum==oddSum){
                System.out.print(i+" ");
            }
        }
    }
}
