package _22_07_2023_ForLoop.Exercise;

import java.util.Scanner;

public class _3_Numbers1NwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=n;i+=3){
            System.out.println(i);
        }
    }
}
