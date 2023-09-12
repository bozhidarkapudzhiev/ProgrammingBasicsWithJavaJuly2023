package _08_07_2023_ConditionalStatements.Exercise;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class _7_AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure=scanner.nextLine();
        double length;
        double height;
        double area = 0;
        if (figure.equals("square")){
            length=Double.parseDouble(scanner.nextLine());
            area=length*length;
        }else if (figure.equals("rectangle")){
            length=Double.parseDouble(scanner.nextLine());
            height=Double.parseDouble(scanner.nextLine());
            area=length*height;
        }else if (figure.equals("circle")){
            double radius=Double.parseDouble(scanner.nextLine());
           area=radius*radius*Math.PI;
        } else if (figure.equals("triangle")) {
            length=Double.parseDouble(scanner.nextLine());
            height=Double.parseDouble(scanner.nextLine());
            area=(length*height)/2;
        }
        System.out.printf("%.3f",area);
    }
}
