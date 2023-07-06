package _01_07_2023_FirstStepsInProgrammingJavaLecture;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         double sqrMeters=Double.parseDouble(scanner.nextLine());
         double amount=sqrMeters*7.61;
         double discort=amount*0.18;
         double sumAfterDiscount=amount-discort;
        System.out.printf("The final price is:%.2f lv.\n",sumAfterDiscount);
        System.out.printf("The discount is %.2f lv.",discort);

          }
}
