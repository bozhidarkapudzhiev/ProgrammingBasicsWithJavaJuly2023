package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double startingNumberOfPoints=Double.parseDouble(scanner.nextLine());
        double points=0;
        if (startingNumberOfPoints<=100){
           points=5;
        } else if (startingNumberOfPoints>1000) {
            points=startingNumberOfPoints*10/100;
        }else {
            points=startingNumberOfPoints*20/100;
        }
        if (startingNumberOfPoints%2==0){
            points+=1;
        }
        if(startingNumberOfPoints%10==5){
            points+=2;
        }
        System.out.println(points);
        System.out.println(points+startingNumberOfPoints);
    }
}
