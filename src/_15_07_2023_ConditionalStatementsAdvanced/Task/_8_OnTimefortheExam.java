package _15_07_2023_ConditionalStatementsAdvanced.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _8_OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int examTime=Integer.parseInt(scanner.nextLine());
       int minutesPerExam=Integer.parseInt(scanner.nextLine());
       int hourOfArrival=Integer.parseInt(scanner.nextLine());
       int minutesOfArrival=Integer.parseInt(scanner.nextLine());

       int examTimeInMinutes=examTime*60+minutesPerExam;
       int arrivalTimeInMinutes=hourOfArrival*60+minutesOfArrival;
       int diff=examTimeInMinutes-arrivalTimeInMinutes;
       String output="";
       if (diff>=0&&diff<=30){
           output="On time";
       }else if (diff>30){
           output="Early";
       }else {
           output="Late";
       }
        System.out.println(output);

       String arrivalPeriod=diff < 0 ? "after":"before";
       diff=Math.abs(diff);
       if (diff<60){
           System.out.printf("%d minutes %s the start",diff,arrivalPeriod);
       }else {
           System.out.printf("%d:%02d hours %s the start",diff/60,diff%60,arrivalPeriod);
       }
    }
}
