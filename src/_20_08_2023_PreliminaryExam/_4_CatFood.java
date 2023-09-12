package _20_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _4_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCats = Integer.parseInt(scanner.nextLine());
        int gramsOfFood;
        double priceCatFood = 12.45;

        for (int i = 1; i <= numberOfCats; i++) {
            gramsOfFood = Integer.parseInt(scanner.nextLine());
            System.out.println(gramsOfFood);

            if (gramsOfFood >= 100 && gramsOfFood < 200) {
             for (int j=0;j<=gramsOfFood;j++){
                 System.out.println("Group 1: 102 cats.1"+j);
             }
            } else if (gramsOfFood >= 200 && gramsOfFood < 300) {
                for (int j=0;j<=gramsOfFood;j++){
                    System.out.println("Group 2: 102 cats.1"+j);
                }

            } else if (gramsOfFood >= 300 && gramsOfFood < 400) {;
                for (int j=0;j<=gramsOfFood;j++){
                    System.out.println("Group 3: 102 cats.1"+j);
                }
            }
        }
    }
}
