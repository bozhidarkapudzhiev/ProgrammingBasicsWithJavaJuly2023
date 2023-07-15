package _08_07_2023_ConditionalStatements.Exercise;

import java.util.Scanner;

public class _3_Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hourse=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
           minutes=minutes+15;
           hourse+=minutes/60;
           minutes%=60;
           if(hourse>=24){
            hourse=-24;
        }

        if (minutes<10){
           System.out.printf("%d:0%d",hourse,minutes);
       }else {
           System.out.printf("%d:%d",hourse,minutes);
       }

    }
}
