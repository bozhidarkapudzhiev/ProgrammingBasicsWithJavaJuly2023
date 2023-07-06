package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class _2_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="12345";
        String readerPass=scanner.nextLine();
        if (readerPass.equals(password)) {
            System.out.println("Welcome");
        } else if (!readerPass.equals(password)) {
            System.out.println("Wrong password!");
        }

    }
}
