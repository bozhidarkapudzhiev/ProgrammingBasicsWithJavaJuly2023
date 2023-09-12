package _12_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _2_{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bachelorettePartyPriceQuntity=Double.parseDouble(scanner.nextLine());
        int numberOfLoveMessagesQuntity =Integer.parseInt(scanner.nextLine());
        int numberOfWaxRosesQuntity =Integer.parseInt(scanner.nextLine());
        int numberOfKeyChainsQuntity=Integer.parseInt(scanner.nextLine());
        int numberOfCartoonsQuntity =Integer.parseInt(scanner.nextLine());
        int  numberOfLuckySurprisesQuntity=Integer.parseInt(scanner.nextLine());
        double hosting=0;
        double saveMoney=0;
        double allPrice=(numberOfLoveMessagesQuntity*0.60)+(numberOfWaxRosesQuntity*7.20)
                +(numberOfKeyChainsQuntity*3.60)+(numberOfCartoonsQuntity*18.20)+(10*numberOfLuckySurprisesQuntity);
        int numArticuls=numberOfLoveMessagesQuntity+numberOfWaxRosesQuntity+numberOfKeyChainsQuntity+numberOfCartoonsQuntity+numberOfLuckySurprisesQuntity;

        if (numArticuls > 135){
            allPrice=allPrice*35/100;
            hosting=allPrice*10/100;
            saveMoney=allPrice-hosting;
            saveMoney=saveMoney-bachelorettePartyPriceQuntity;
        }
        if (saveMoney>bachelorettePartyPriceQuntity){
            System.out.printf("Yes! %.2f left.",saveMoney);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",saveMoney);
        }
    }
}
