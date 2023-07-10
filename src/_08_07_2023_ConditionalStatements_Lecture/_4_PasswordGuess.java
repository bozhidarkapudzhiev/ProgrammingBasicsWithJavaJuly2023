package _08_07_2023_ConditionalStatements_Lecture;

import java.util.Scanner;

public class _4_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        if(password.equals("kapudzhiev")){
            System.out.println("Welcome!");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
