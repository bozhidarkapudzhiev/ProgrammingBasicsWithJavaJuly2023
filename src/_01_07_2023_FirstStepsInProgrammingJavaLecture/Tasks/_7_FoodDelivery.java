package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int chickenMenu=Integer.parseInt(scanner.nextLine());
       int fishMenu=Integer.parseInt(scanner.nextLine());
       int vegetarianMenu=Integer.parseInt(scanner.nextLine());

       double priceChickenMenu=10.35*chickenMenu;
       double priceFishMenu=12.40*fishMenu;
       double priceVegetarianMenu=8.15*vegetarianMenu;
       double allPrice=priceChickenMenu+priceFishMenu+priceVegetarianMenu;
       double priceDessert=(allPrice*20/100);
       allPrice=allPrice+priceDessert+2.50;
        System.out.println(allPrice);

    }
}
