package _22_07_2023_ForLoop.Exercise;

import java.util.Scanner;

public class _9_LeftandRightSum {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n=Integer.parseInt(scanner.nextLine());
      int sum=0;
      int left=0;
      int right=0;
      for (int i=0;i<n;i++){
          int num=Integer.parseInt(scanner.nextLine());
          left+=num;
          sum=left;
      }
      for (int i=0; i<n;i++){
          int num=Integer.parseInt(scanner.nextLine());
          right+=num;
          sum=right;
      }
      boolean leftEqualsRight=(left==right);

      if (leftEqualsRight){
          System.out.printf("Yes, sum = "+sum);
      }else {
          sum= Math.abs(left-right);
          System.out.printf("No, diff = %d",sum);
      }
    }
}