package _22_07_2023_ForLoop.Task;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroupsOfClimbers = Integer.parseInt(scanner.nextLine());
        int numberOfPeopleInAGroup = 0;
        int p1=0,p2=0,p3=0,p4=0,p5=0;
        int totalPrice=0;
        for (int i = 1; i <= numberOfGroupsOfClimbers; i++) {
            numberOfPeopleInAGroup = Integer.parseInt(scanner.nextLine());
            if (numberOfPeopleInAGroup <= 5) {      //Musala
               p1+= numberOfPeopleInAGroup;
               totalPrice+=numberOfPeopleInAGroup;
            } else if (numberOfPeopleInAGroup<=12){     //Monblan
               p2+= numberOfPeopleInAGroup;
                totalPrice+=numberOfPeopleInAGroup;
            } else if ( numberOfPeopleInAGroup <= 25) {     //Kilimandzharo
               p3+= numberOfPeopleInAGroup;
                totalPrice+=numberOfPeopleInAGroup;
            } else if (numberOfPeopleInAGroup <= 40) {  //K2
                p4+= numberOfPeopleInAGroup;
                totalPrice+=numberOfPeopleInAGroup;
            } else if (numberOfPeopleInAGroup>=41) {    //Everest
                p5+=numberOfPeopleInAGroup;
                totalPrice+=numberOfPeopleInAGroup;
            }

        }
        System.out.printf("%.2f%%%n",100.0*p1/totalPrice);
        System.out.printf("%.2f%%%n",100.0*p2/totalPrice);
        System.out.printf("%.2f%%%n",100.0*p3/totalPrice);
        System.out.printf("%.2f%%%n",100.0*p4/totalPrice);
        System.out.printf("%.2f%%%n",100.0*p5/totalPrice);

    }
}
