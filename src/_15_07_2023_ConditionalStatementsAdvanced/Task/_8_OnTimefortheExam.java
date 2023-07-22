package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.util.Scanner;

public class _8_OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour=Integer.parseInt(scanner.nextLine());
        int exampMinutes=Integer.parseInt(scanner.nextLine());
        int arrivalHour=Integer.parseInt(scanner.nextLine());
        int arrivalMinutes=Integer.parseInt(scanner.nextLine());

        int examTimeMinutes=examHour*60+exampMinutes;
        int arrivalTimeMinutes=arrivalHour*60+arrivalMinutes;
        int diffMinutes=examTimeMinutes-examTimeMinutes;

        String output;

        if(diffMinutes>=0 && diffMinutes<=30){
            output="On time";
        } else if (diffMinutes>30) {
            output="Early";
        }else {
            output="Late";
        }

        System.out.println(output);

        String arrivalPeriod;

        if(diffMinutes>0){
            arrivalPeriod="before";
        }else {
            arrivalPeriod="after";
        }

        diffMinutes=Math.abs(diffMinutes);

        if(diffMinutes<60){
            System.out.printf("%d minutes %s the start",diffMinutes,arrivalPeriod);
        }else{
            System.out.printf("%d:%02d hours %s the star",diffMinutes/60,diffMinutes%60,arrivalPeriod);
        }
    }
}
