package _15_07_2023_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _2_WeekendorWorkingDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dayOfWeek=scanner.nextLine();
        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case"Friday":
                System.out.println("Working day");
                break;
            case"Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");

        }
    }
}
