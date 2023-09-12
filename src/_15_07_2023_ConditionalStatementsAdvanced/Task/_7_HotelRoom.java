package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mount=scanner.nextLine();
        int numberOfNights=Integer.parseInt(scanner.nextLine());
        double priceStudio=0,priceApartment=0;
        if (mount.equals("May")||mount.equals("October")){
            priceStudio=numberOfNights*50.00;
            priceApartment=numberOfNights*65.00;
        }else if (mount.equals("June")||mount.equals("September")){
            priceStudio=numberOfNights*75.20;
            priceApartment=numberOfNights*68.70;
        }else if (mount.equals("July")||mount.equals("August")){
            priceStudio=numberOfNights*76.00;
            priceApartment=numberOfNights*77.00;
        }
        if (numberOfNights>7&&numberOfNights<14&&(mount.equals("May")||mount.equals("October"))){
           priceStudio=priceStudio-(priceStudio*5/100);
        }else if (numberOfNights>14&&(mount.equals("May")||mount.equals("October"))){
            priceStudio=priceStudio-(priceStudio*30/100);
        }else if(numberOfNights>14&&mount.equals("June")||mount.equals("September")){
            priceStudio=priceStudio-(priceStudio*20/100);
        }

        if (numberOfNights>14){
            priceApartment=priceApartment-(priceApartment*10/100);
        }
        System.out.printf("Apartment: %.2f lv.\n",priceApartment);
        System.out.printf("Studio: %.2f lv.",priceStudio);
    }
}