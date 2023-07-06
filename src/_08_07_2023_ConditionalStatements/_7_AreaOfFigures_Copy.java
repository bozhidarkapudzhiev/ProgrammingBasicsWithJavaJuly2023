package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class _7_AreaOfFigures_Copy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String shape=scanner.nextLine();
       double area=0.0;
       if (shape.equals("square")){
           double side=Double.parseDouble(scanner.nextLine());
           area=side*side;
        }else if(shape.equals("rectangle")){
           double sideA=Double.parseDouble(scanner.nextLine());
           double sideB=Double.parseDouble(scanner.nextLine());
           area=sideA*sideB;
       } else if (shape.equals("circle")) {
           double radius = Double.parseDouble(scanner.nextLine());
           area = Math.PI * (radius * radius);
       } else if (shape.equals("triangle")) {
           double triangleA=Double.parseDouble(scanner.nextLine());
           double triangleB=Double.parseDouble(scanner.nextLine());
           area=(triangleA*triangleB)/2;
       }
        System.out.println(area);
    }
}
