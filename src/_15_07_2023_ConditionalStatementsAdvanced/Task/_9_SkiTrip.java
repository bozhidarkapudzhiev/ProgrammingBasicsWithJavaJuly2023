package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int daysToStay=Integer.parseInt(scanner.nextLine())-1;
          String typeOfRoom =scanner.nextLine();
          String evaluation=scanner.nextLine();
          double pricePerNight=0;
          switch (typeOfRoom){
              case "room for one person":
                  pricePerNight=18.00*daysToStay;
                  break;
              case "apartment":
                  pricePerNight=25.00*daysToStay;
                  if (daysToStay<10){
                      pricePerNight=pricePerNight-(pricePerNight*30/100);
                  }else if (daysToStay>10&&daysToStay<15){
                      pricePerNight=pricePerNight-(pricePerNight*35/100);
                  }else {
                      pricePerNight=pricePerNight-(pricePerNight*50/100);
                  }
                  break;
              case "president apartment":
                  pricePerNight=35*daysToStay;
                  if (daysToStay<10){
                      pricePerNight=pricePerNight-(pricePerNight*10/100);
                  } else if (daysToStay>10&& daysToStay<15) {
                      pricePerNight=pricePerNight-(pricePerNight*15/100);
                  }else {
                      pricePerNight=pricePerNight-(pricePerNight*20/100);
                  }
                  break;
          }
          if (evaluation.equals("positive")){
              pricePerNight=pricePerNight+(pricePerNight*25/100);
          }else if (evaluation.equals("negative")){
              pricePerNight=pricePerNight-(pricePerNight*10/100);
          }
        System.out.printf("%.2f",pricePerNight);
    }
}
