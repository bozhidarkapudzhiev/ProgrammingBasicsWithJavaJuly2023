package _08_07_2023_ConditionalStatements.Tasks;

import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n=Double.parseDouble(scanner.nextLine());
        double addBonusScore=0;
        if (n<=100){
            addBonusScore+=5;
        } else if (n>1000) {
            addBonusScore=n*10/100;
        }else if (n>100) {
            addBonusScore=n*20/100;
        }
        if (n%2==0){
            addBonusScore+=1;
        }if (n%10==5){
            addBonusScore+=2;
        }
        System.out.println(addBonusScore);
        System.out.println(n+addBonusScore);
    }
}
