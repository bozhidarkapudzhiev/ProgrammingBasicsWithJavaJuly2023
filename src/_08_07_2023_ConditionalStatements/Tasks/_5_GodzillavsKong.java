package _08_07_2023_ConditionalStatements.Tasks;

import java.util.Scanner;

public class _5_GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfExtras = Integer.parseInt(scanner.nextLine());
        double costOfClothing = Double.parseDouble(scanner.nextLine());
        double decorPrice = (budget * 10) / 100;
       double sumForMovie= costOfClothing * numberOfExtras;
        if (numberOfExtras >= 150) {
            double discount =sumForMovie*10/100;
            sumForMovie=sumForMovie-discount;
            decorPrice+=sumForMovie;
            budget=budget-decorPrice;

        } else{
            decorPrice += sumForMovie;
            budget=budget-decorPrice;
        }
    if (budget<0){
          System.out.printf("Not enough money!\nWingard needs %.2f leva more.",Math.abs(budget));
      }else {
          System.out.printf("Action!\nWingard starts filming with %.2f leva left.",budget);
      }
    }
}
