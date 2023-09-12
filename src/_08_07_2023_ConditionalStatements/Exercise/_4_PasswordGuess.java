package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _4_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password=scanner.nextLine();
        String passwordEncoding="s3cr3t!P@ssw0rd";
        if (password.equals(passwordEncoding)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
