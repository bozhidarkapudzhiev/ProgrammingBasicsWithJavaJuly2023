package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _9_YardGreening_copy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int squareМeters=Integer.parseInt(scanner.nextLine());
         double singlePriceOfTheProduct=Double.parseDouble(scanner.nextLine());
        System.out.println(squareМeters*singlePriceOfTheProduct);
         double offTheFinalPrice=Double.parseDouble(scanner.nextLine());

        double result= ((squareМeters*singlePriceOfTheProduct));
            //System.out.println(result*offTheFinalPrice);
        double result1=offTheFinalPrice*result;
        System.out.print("The final price is:" +(result-result1));

    }
}
