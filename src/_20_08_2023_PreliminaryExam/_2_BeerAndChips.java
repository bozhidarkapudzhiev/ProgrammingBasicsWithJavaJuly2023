package _20_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _2_BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String footballFanNames=scanner.nextLine();
        double budget=Double.parseDouble(scanner.nextLine());
        int quantityOfBeers=Integer.parseInt(scanner.nextLine());
        int amountOfChips=Integer.parseInt(scanner.nextLine());

        double beerPrice=1.20*quantityOfBeers;
        double priceForChips=(beerPrice-(beerPrice*55)/100);
        priceForChips=Math.ceil(priceForChips*amountOfChips);

       /* System.out.println(beerPrice);
        System.out.printf("%.2f",priceForChips);*/
        priceForChips=priceForChips+beerPrice;
       // budget=budget-priceForChips;

        if (budget>priceForChips){
            budget=budget-priceForChips;
            System.out.printf("%s bought a snack and has %.2f leva left.",footballFanNames,budget);
        }else if (budget<priceForChips){
            budget=priceForChips-budget;
            System.out.printf("%s needs %.2f more leva!",footballFanNames,budget);
        }
    }
}
