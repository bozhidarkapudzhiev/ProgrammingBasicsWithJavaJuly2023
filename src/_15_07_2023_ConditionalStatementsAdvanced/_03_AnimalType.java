package _15_07_2023_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _03_AnimalType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String animal=scanner.nextLine();
        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case  "cat":
                System.out.println("unknown");
                break;
        }
    }
}
