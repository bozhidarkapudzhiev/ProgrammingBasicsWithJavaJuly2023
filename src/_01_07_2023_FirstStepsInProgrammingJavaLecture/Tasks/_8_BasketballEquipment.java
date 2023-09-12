package _01_07_2023_FirstStepsInProgrammingJavaLecture.Tasks;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anAnnualFee=Integer.parseInt(scanner.nextLine());
        double sneakers=(double)anAnnualFee-(anAnnualFee*40/100);
        double team=sneakers-(sneakers*20/100);
        double ball=team/4;
        double accessories=ball/5;
        double allPrice=anAnnualFee+sneakers+team+ball+accessories;
        System.out.println(allPrice);
    }
}
