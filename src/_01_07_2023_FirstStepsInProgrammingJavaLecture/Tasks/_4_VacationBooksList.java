package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPagesNumber=Integer.parseInt(scanner.nextLine());
        int pagesInAnHour=Integer.parseInt(scanner.nextLine());
        int numberOfDays=Integer.parseInt(scanner.nextLine());

        int totalTime=(numberOfPagesNumber/pagesInAnHour)/numberOfDays;
        System.out.println(totalTime);

    }
}
