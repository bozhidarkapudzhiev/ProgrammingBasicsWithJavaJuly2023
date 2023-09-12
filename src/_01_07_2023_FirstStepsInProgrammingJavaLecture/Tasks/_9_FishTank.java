package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        double percent=Double.parseDouble(scanner.nextLine());

        /*
        * volume
        volume in liters
        occupied space
        liters needed
        * */
        double volume=length*width*height;
        double volumeInLiters=(volume/1000);
        volumeInLiters=volumeInLiters-(volumeInLiters*percent)/100;
        System.out.println(volumeInLiters);

    }
}
