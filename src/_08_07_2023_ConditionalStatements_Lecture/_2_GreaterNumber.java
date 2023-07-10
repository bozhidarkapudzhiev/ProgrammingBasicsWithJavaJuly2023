package _08_07_2023_ConditionalStatements_Lecture;

import java.util.Scanner;

public class _2_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNumb=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        if (firstNumb>secondNum){
            System.out.println(firstNumb);
        } else{
            System.out.println(secondNum);
        }
    }
}
