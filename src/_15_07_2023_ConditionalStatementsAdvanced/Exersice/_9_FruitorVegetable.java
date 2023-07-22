package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _9_FruitorVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitAndVegetable=scanner.nextLine();
        switch (fruitAndVegetable){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }

}
