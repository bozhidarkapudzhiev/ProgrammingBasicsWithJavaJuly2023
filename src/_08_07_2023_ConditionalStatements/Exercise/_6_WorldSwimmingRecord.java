package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double bestSecondsRecord=Double.parseDouble(scanner.nextLine());
        int theDistanceInMeters=Integer.parseInt(scanner.nextLine());
        double timeIsASecond=Double.parseDouble(scanner.nextLine());
        double allTime= timeIsASecond*theDistanceInMeters;
        double addTime=(theDistanceInMeters/15)*12.5;
        double result=Math.abs((allTime+addTime)-bestSecondsRecord);
        if (bestSecondsRecord<result){
            System.out.printf("No, he failed! He was %.2f seconds slower.",result);
        }else if(bestSecondsRecord>(allTime+addTime)){
            result=Math.abs((allTime+addTime));
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",result);
        }


    }
}
