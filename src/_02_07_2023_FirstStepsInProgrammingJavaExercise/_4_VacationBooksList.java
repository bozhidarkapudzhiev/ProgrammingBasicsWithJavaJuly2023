package _02_07_2023_FirstStepsInProgrammingJavaExercise;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int booksLength=Integer.parseInt(scanner.nextLine());
        int pagesReaderForOneHouse=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int allTimeForReaderOnBooks=booksLength/pagesReaderForOneHouse;
        int timeReaderForDay=allTimeForReaderOnBooks/days;
        System.out.println(timeReaderForDay);
    }
}
