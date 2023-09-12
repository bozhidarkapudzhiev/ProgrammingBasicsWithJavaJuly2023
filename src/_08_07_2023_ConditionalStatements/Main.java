package _08_07_2023_ConditionalStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*  String a="Example";
     String b=a;
     boolean equalsAB=(a==b);
        System.out.println(equalsAB);   //true*/
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        boolean isEqualsAB=(a.equals(b));
        if (isEqualsAB==true){
            System.out.println("a==b");
        }else {
            System.out.println("!a=b");
        }
    }
}
