package _20_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _1_ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int  numberOfPages=899;
       int  numberOfCovers=2;

        double costPerPage=Double.parseDouble(scanner.nextLine());
        double coverPrice=Double.parseDouble(scanner.nextLine());
        int printingOnPaper=Integer.parseInt(scanner.nextLine());
        double designerPrice=Double.parseDouble(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());


       double totalAmount=(numberOfPages*costPerPage)+(numberOfCovers*coverPrice);
       totalAmount=totalAmount-(totalAmount*printingOnPaper)/100;
       totalAmount=totalAmount+designerPrice;
       totalAmount=totalAmount-(totalAmount*discount)/100;
      // totalAmount=totalAmount-printingOnPaper;

        System.out.printf("Avtonom should pay %.2f BGN.",totalAmount);

    }
}
