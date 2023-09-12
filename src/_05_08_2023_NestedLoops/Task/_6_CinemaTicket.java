package _05_08_2023_NestedLoops.Task;

import java.util.Scanner;

public class _6_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int standard=0;
        int student=0;
        int kid=0;

        String movieName=scanner.nextLine();

        while (!"Finish".equalsIgnoreCase(movieName)){
            int freeSeats=Integer.parseInt(scanner.nextLine());
            int seats=freeSeats;
            String ticketType=scanner.nextLine();
            while (!"End".equalsIgnoreCase(ticketType)&& freeSeats>0){

                switch (ticketType){
                    case "standard":
                        ++standard;
                        break;
                    case "student":
                        ++student;
                        break;
                    case "kid":
                        ++kid;
                        break;
                }

                --freeSeats;
                ticketType=scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movieName,(double)(seats-freeSeats/seats*100.0));
            movieName=scanner.nextLine();
            int  totalTicket=standard+student+kid;
            System.out.printf("Total tickets: %d",totalTicket);
            System.out.printf("%.2f students tickets.",(double)student/totalTicket*100);
            System.out.printf("%.2f students tickets.",(double)student/totalTicket*100);
            System.out.printf("%.2f students tickets.",(double)kid/totalTicket*100);


        }
    }
}
