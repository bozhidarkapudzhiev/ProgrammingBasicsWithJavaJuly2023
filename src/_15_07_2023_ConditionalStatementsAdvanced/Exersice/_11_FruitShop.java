package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String fruit =scanner.nextLine();
       String dayOfWeek=scanner.nextLine();
       double quantity=Double.parseDouble(scanner.nextLine());
       double price=0;
       boolean isFruit= fruit.equals("banana")||fruit.equals("apple")||fruit.equals("orange")||fruit.equals("grapefruit")||fruit.equals("kiwi")||fruit.equals("pineapple")||fruit.equals("grapes");
       boolean isWeek=dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Wednesday")||dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday");
       boolean isWeekend=dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday");


     if (isFruit) {
         if (isWeekend || isWeek) {
             if (isWeek){
                 switch (fruit) {
                     case "banana":
                         price += quantity * 2.50;
                         break;
                     case "apple":
                         price += quantity * 1.20;
                         break;
                     case "orange" :
                         price += quantity * 0.85;
                         break;
                     case "grapefruit":
                         price += quantity * 1.45;
                         break;
                     case "kiwi":
                         price += quantity * 2.70;
                         break;
                     case "pineapple":
                         price += quantity * 5.50;
                         break;
                     case "grapes":
                         price += quantity * 3.85;
                         break;

                 }

             }
             if (isWeekend) {
                 switch (fruit){
                     case "banana":
                         price+=quantity*2.70;
                         break;
                     case"apple":
                         price+=quantity*1.25;
                         break;
                     case "orange":
                         price+=quantity*0.90;
                         break;
                     case "grapefruit":
                         price+=quantity*1.60;
                         break;
                     case "kiwi":
                         price+=quantity*3.00;
                         break;
                     case "pineapple":
                         price+=quantity*5.60;
                         break;
                     case "grapes":
                         price+=quantity*4.20;
                 }

             }
             System.out.printf("%.2f",price);
         }else {
             System.out.println("error");
         }
     }else {
         System.out.println("error");
     }
    }
}