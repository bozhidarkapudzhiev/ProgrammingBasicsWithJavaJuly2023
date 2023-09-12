package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityPerNylon=Integer.parseInt(scanner.nextLine());
        int quantityCostOfPaint=Integer.parseInt(scanner.nextLine());
        int quantityCostOfDiluent=Integer.parseInt(scanner.nextLine());
        int hoursOfWorkOfACraftsman=Integer.parseInt(scanner.nextLine());

        quantityPerNylon=quantityPerNylon+2;
        quantityCostOfPaint=(quantityCostOfPaint+(quantityCostOfPaint*10));

        double pricePerNylon=1.50*quantityPerNylon;
        double costOfPaint=(14.50*quantityCostOfPaint)/10;
        double costOfDiluent=5.00*quantityCostOfDiluent;
        double costOfMaterials=pricePerNylon+costOfPaint+costOfDiluent+0.40;

        double amountForMaster= (costOfMaterials*30/100)*hoursOfWorkOfACraftsman;
        double finalePrice=costOfMaterials+amountForMaster;
        System.out.println(finalePrice);

    }
}