package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class _7_AreaOfFigures_Copy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String geometricTypes= scanner.nextLine();
        switch (geometricTypes){
            case "square":
                double a=Double.parseDouble(scanner.nextLine());
                double areaSquare=a*a;
                System.out.println(areaSquare);
            case "rectangle":
                int width=Integer.parseInt(scanner.nextLine());
                double heigth=Double.parseDouble(scanner.nextLine());
                double areaRectangle=heigth*width;
                System.out.println(areaRectangle);
            case "circle":
                double radius=Double.parseDouble(scanner.nextLine());
                double radiusArea=Math.PI*(radius*radius);
                System.out.printf("%.3f",radiusArea);
            case"triangle":
                double triangleA=Double.parseDouble(scanner.nextLine());
                int triangleB=Integer.parseInt(scanner.nextLine());
                double triangleArea=(triangleA*triangleB)/2;
                System.out.println(triangleArea);

        }
    }
}
