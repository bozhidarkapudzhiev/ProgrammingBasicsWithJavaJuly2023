package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _8_CinemaTicket {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String dayOfWeek=scanner.nextLine();
            int priceTicket=12;
            switch (dayOfWeek){
                case "Monday":
                case "Tuesday":
                case "Friday":
                    priceTicket=priceTicket;
                    break;
                case "Wednesday":
                case "Thursday":
                    priceTicket+=2;
                    break;
                case "Saturday":
                case "Sunday":
                    priceTicket+=4;
                    break;

            }
            System.out.println(priceTicket);
        }
    }

