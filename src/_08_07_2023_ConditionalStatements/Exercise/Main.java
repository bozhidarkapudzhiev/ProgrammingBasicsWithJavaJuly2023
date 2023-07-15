package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        if (name.equals("")){
            System.out.println("Invalid name.");
        }else{
            System.out.printf(name);
        }
    }
}
