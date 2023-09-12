package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;
import java.util.SortedMap;

public class _7_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        String dayOfWeek=scanner.nextLine();
        String open="open";
        String closed="closed";
        if (hours>=10&&hours<=18){
            switch (dayOfWeek){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println(open);
                    break;
                case "Sunday":
                    System.out.println(closed);
                    break;
            }
        }else {
            System.out.println(closed);
        }
    }
}