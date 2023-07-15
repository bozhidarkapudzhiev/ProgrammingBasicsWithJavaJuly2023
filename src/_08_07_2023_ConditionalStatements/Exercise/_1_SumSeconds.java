package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _1_SumSeconds {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
    int firstTime=Integer.parseInt(scanner.nextLine());
    int secondTime=Integer.parseInt(scanner.nextLine());
    int thrid=Integer.parseInt(scanner.nextLine());
    int second= firstTime+secondTime+thrid;
    int min=second/60;
    int sec=second%60;
    if(sec<10){
        System.out.printf("%d:0%d",min,sec);
    }else {
        System.out.printf("%d:%d",min,sec);
    }
    }
}
