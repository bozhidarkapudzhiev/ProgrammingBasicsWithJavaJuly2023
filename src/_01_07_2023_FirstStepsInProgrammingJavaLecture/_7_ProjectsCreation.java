package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameOfTheArchitect=scanner.nextLine();
        int timeForProject=3;
        int  numberOfProject=Integer.parseInt(scanner.nextLine());
        int totalProjectTime=timeForProject*numberOfProject;
        System.out.println("The architect "+nameOfTheArchitect+" will need "+
                            totalProjectTime+" hours to complete "+numberOfProject+" project/s.");
    }
}
