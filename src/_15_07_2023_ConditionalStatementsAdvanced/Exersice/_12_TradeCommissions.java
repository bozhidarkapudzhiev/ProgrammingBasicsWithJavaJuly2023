package _15_07_2023_ConditionalStatementsAdvanced.Exersice;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town=scanner.nextLine();
        double sales=Double.parseDouble(scanner.nextLine());
        boolean isTown=town.equals("Sofia")||town.equals("Varna")||town.equals("Plovdiv");

        if (isTown) {
            switch (town) {
                case "Sofia":
                    if (sales <= 500) {
                        sales = sales * 5 / 100;
                    } else if (sales > 500 && sales <= 1000) {
                        sales = sales * 7 / 100;
                    } else if (sales > 1000 && sales <= 10000) {
                        sales = sales * 8 / 100;
                    } else if (sales > 10000) {
                        sales = sales * 12 / 100;
                    }
                    break;
                case "Varna":
                    if (sales <= 500) {
                        sales = sales * 4.5 / 100;
                    } else if (sales > 500 && sales <= 1000) {
                        sales = sales * 7.5 / 100;
                    } else if (sales > 1000 && sales <= 10000) {
                        sales = sales * 10 / 100;
                    } else if (sales > 10000) {
                        sales = sales * 13 / 100;
                    }
                    break;
                case "Plovdiv":
                    if (sales <= 500) {
                        sales = sales * 5.5 / 100;
                    } else if (sales > 500 & sales <= 1000) {
                        sales = sales * 8 / 100;
                    } else if (sales > 1000 & sales <= 10000) {
                        sales = sales * 12 / 100;
                    } else if (sales > 10000) {
                        sales = sales * 14.5 / 100;
                    }
                    break;
            }
        }
        if (sales<0||!isTown){
            System.out.println("error");
        }else {
            System.out.printf("%.2f",sales);
        }

    }
}