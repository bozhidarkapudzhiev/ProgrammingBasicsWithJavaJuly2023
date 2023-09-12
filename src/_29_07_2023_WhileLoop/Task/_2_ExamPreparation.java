package _29_07_2023_WhileLoop.Task;

import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoorGrade=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        String command="Enough";
        int poorGradeCount=0;
        int taskCount=0;
        int gradesSum=0;
        String lastTaskName="";
        boolean isMaxPoorGrade=false;
        while (!command.equals(input)){
            ++taskCount;
            int grade=Integer.parseInt(scanner.nextLine());
            gradesSum+=grade;
            lastTaskName=input;
            if(grade<=4){
                ++poorGradeCount;
                if (poorGradeCount==maxPoorGrade){
                    isMaxPoorGrade=true;
                    break;
                }
            }

            input=scanner.nextLine();

        }
        if (isMaxPoorGrade){
            System.out.printf("You need a break, %d poor grades.",poorGradeCount);
        }else {
            System.out.printf("Average score: %.2f\n",(double)gradesSum/taskCount);
            System.out.printf("Number of problems: %d\n",taskCount);
            System.out.printf("Last problem: %s\n",lastTaskName);
        }
    }
}
