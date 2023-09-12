package _22_07_2023_ForLoop.Task;

import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTab = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        String browserName = null;
        for (int i = 1; i <= openTab; i++) {
            browserName = scanner.nextLine();
            if (browserName.equals("Facebook")){
                salary-=150.0;
            }if (browserName.equals("Instagram")){
                salary-=100.0;

            }if (browserName.equals("Reddit")){
                salary-=50.0;
            }

        }

        if (salary<=0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.printf("%.0f",salary);
        }


    }
}
