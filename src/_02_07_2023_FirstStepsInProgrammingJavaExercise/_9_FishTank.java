package _02_07_2023_FirstStepsInProgrammingJavaExercise;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lenght=Integer.parseInt(scanner.nextLine());
        int weith=Integer.parseInt(scanner.nextLine());
        int heigth=Integer.parseInt(scanner.nextLine());
        double occupiedSpace=Double.parseDouble(scanner.nextLine());
        double liters=(lenght*weith*heigth);
        double litersNeeded = liters - liters * occupiedSpace/100;

        System.out.println(litersNeeded);

        /*
        * package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double volumeLitters = volume / 1000;

        double result = volumeLitters * (1 - percent / 100);

        System.out.println(result);
    }
}*/
    }
}
