package _29_07_2023_WhileLoop.Exercise;

import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int counter=1;
        double sum=0;
        int excluded=0;
        boolean isGreadeted=true;
        while(counter<=12) {
            //четем оценка  от конзолата
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                excluded++;
                if (excluded >= 2) {
                    isGreadeted=false;
                    System.out.printf("%s has been excluded at %s grade", name, counter);
                    break;
                }
                continue;
            }
            //събиране  на  оценките
            sum += grade;
            //преминаване в следващия клас
            counter++;
        }
        if (isGreadeted){
            System.out.printf("%s graduated. Average grade:%s grade",name,sum/12);
        }

        }
    }

