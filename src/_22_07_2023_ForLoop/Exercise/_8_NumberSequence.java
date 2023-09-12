package _22_07_2023_ForLoop.Exercise;

import java.util.Scanner;

public class _8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <=n ; i++) {
            int current=Integer.parseInt(scanner.nextLine());
            if (max<current){
                max=current;
            }
            if (min>current){
                min=current;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
    }
}