package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _1_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        if (n>=5){
            System.out.println("Excellent!");
        }else{
            System.out.println();
        }
    }
}
