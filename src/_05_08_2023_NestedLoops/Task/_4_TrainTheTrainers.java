package _05_08_2023_NestedLoops.Task;

import java.util.Scanner;

public class _4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfJudges=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        double grades=0;
        int presentationCount=0;
        while(!"Finish".equalsIgnoreCase(input)){
            ++presentationCount;
            double gradesSum=0;
            for (int i = 0; i <numOfJudges; i++) {
                double grade=Double.parseDouble(scanner.nextLine());
                gradesSum+=grade;
            }
            grades+=gradesSum;
            System.out.printf("%s - %.2f.%n",input,gradesSum/numOfJudges);


        }
        System.out.printf("Student's final assessment is %.2f.",grades/(presentationCount*numOfJudges));

    }
}
