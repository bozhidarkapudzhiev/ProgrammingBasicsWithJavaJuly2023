package _08_07_2023_ConditionalStatements.Tasks;

import java.util.Scanner;

public class _3_Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes+=15;

        if (minutes>59){
            minutes=minutes%60;
            hours+=1;
        }
        if (hours>23){
                hours=0;
        }
        if (minutes<10){
            System.out.printf("%d:0%d",hours,minutes);
        }else {
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
