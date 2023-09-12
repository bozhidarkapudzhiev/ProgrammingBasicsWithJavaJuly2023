package _08_07_2023_ConditionalStatements.Tasks;

import java.util.Scanner;

public class _1_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;
        int minutes = 0;
        int second=0;
        if (totalTime >= 60) {
            minutes = totalTime / 60;
            second = totalTime % 60;
            if (second < 10) {
                System.out.printf("%d:0%d", minutes, second);
            } else {
                System.out.printf("%d:%d", minutes, second);
            }
        }else {
            second = totalTime % 60;
            if (second < 10) {
                System.out.printf("%d:0%d", minutes, second);
            } else {
                System.out.printf("%d:%d", minutes, second);
            }
        }

    }
}
