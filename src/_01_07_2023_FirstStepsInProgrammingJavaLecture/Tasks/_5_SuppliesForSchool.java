package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hemicals=Integer.parseInt(scanner.nextLine());
        int markers=Integer.parseInt(scanner.nextLine());
        int preparation=Integer.parseInt(scanner.nextLine());
        int discount =Integer.parseInt(scanner.nextLine());

        double priceHemicals=5.80*hemicals;
        double priceMarkers=7.20*markers;
        double pricePreparation=1.20*preparation;
        double allPrice=(priceHemicals+priceMarkers+pricePreparation);
        allPrice=allPrice-((allPrice*discount)/100);
        System.out.println(allPrice);
    }
}
