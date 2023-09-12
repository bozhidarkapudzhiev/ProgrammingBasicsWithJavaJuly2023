package _29_07_2023_WhileLoop.Task;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps=10000;

        while(steps>0){
            String input=scanner.nextLine();
            if ("Going home".equals(input)){
                int finaleSteps=Integer.parseInt(scanner.nextLine());
                steps-=finaleSteps;
                break;
            }
            int currentSteps=Integer.parseInt(input);
            steps-=currentSteps;
       }
        if (steps<=0){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",Math.abs(steps));
        }else {
            System.out.printf("%d more steps to reach goal.",steps);
        }
    }
}
