package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class _3_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        String passCorrect="password";
        if (password.equals(passCorrect)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
