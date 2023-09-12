package _22_07_2023_ForLoop.Exercise;

import java.util.Scanner;

public class _2_NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int n=Integer.parseInt(scanner.nextLine());
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
