package _29_07_2023_WhileLoop.Exercise;

import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String username=scanner.nextLine();
       String password=scanner.nextLine();
       String correctPass=scanner.nextLine();
       while (!correctPass.equals(password)){
           System.out.println("Error");
           correctPass=scanner.nextLine();
       }
       System.out.printf("Welcome %s!",username);
    }
}
