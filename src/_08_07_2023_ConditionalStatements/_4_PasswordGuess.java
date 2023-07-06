package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class _4_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        String passCorrect="s3cr3t!P@ssw0rd";
        if (password.equals(passCorrect)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
