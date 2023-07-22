package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _8_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String daysOfWeek=scanner.nextLine();
        int ticketPrice = 12;
        switch (daysOfWeek){
            case "Monday":
            if (daysOfWeek.equals("Monday")) {
                ticketPrice=ticketPrice;
            }
                System.out.println(ticketPrice);
            break;
            case "Tuesday":
                if(daysOfWeek.equals("Tuesday")){
                    ticketPrice=ticketPrice;
                }
                System.out.println(ticketPrice);
                break;
            case "Wednesday":
                if (daysOfWeek.equals("Wednesday")){
                   ticketPrice+=2;
                }
                System.out.println(ticketPrice);
                break;
            case "Thursday":
                if(daysOfWeek.equals("Thursday")){
                    ticketPrice+=2;
                }
                System.out.println(ticketPrice);
                break;
            case "Friday":
                if (daysOfWeek.equals("Friday")){
                    ticketPrice=ticketPrice;
                }
                System.out.println(ticketPrice);
                break;
            case "Saturday":
                if (daysOfWeek.equals("Saturday")) {
                    ticketPrice += 4;
                }
                System.out.println(ticketPrice);
                break;
            case "Sunday":
                if (daysOfWeek.equals("Sunday")) {
                    ticketPrice += 4;
                }
                System.out.println(ticketPrice);
                break;

        }
        }

    }

