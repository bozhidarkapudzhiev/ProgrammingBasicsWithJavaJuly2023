package _01_07_2023_FirstStepsInProgrammingJavaLecture.Exercise;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameArchitect=scanner.nextLine();
        int numberProject=Integer.parseInt(scanner.nextLine());
        int hours=numberProject*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",nameArchitect,hours,numberProject);
    }
}
