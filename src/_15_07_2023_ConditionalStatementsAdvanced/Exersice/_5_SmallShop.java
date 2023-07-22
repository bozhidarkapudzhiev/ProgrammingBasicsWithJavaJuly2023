package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _5_SmallShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product=scanner.nextLine();
        String city=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());

        double price=0;
        switch (city){
            case "Sofia":
              if (product.equals("coffee")){
                  price=0.5;
              }
              if (product.equals("water")){
                  price=0.8;
              }
              if (product.equals("beer")){
                  price=1.20;
              }
              if (product.equals("sweets")){
                  price=1.45;
              }
              if (product.equals("peanuts")){
                  price=1.60;
              }
                break;
           case "Plovdiv":
               if(product.equals("coffee")){
                   price=0.4;
               }
               if (product.equals("water")){
                   price=0.7;
               }
               if (product.equals("beer")){
                   price=1.15;
               }
              if (product.equals("sweets")){
                  price=1.3;
              }
              if(product.equals("peanuts")){
                  price=1.5;
              }
                break;
            case "Varna":
                if (product.equals("coffee")){
                    price=0.45;
                }
                if (product.equals("water")){
                    price=0.7;
                }
                if(product.equals("beer")){
                    price=1.10;
                }
                if(product.equals("sweets")){
                    price=1.35;
                }
                if (product.equals("peanuts")){
                    price=1.55;
                }
                break;



        }
        double finalPrice=price*quantity;
        System.out.println(finalPrice);
    }
}

