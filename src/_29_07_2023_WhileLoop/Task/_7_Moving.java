package _29_07_2023_WhileLoop.Task;

import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w=Integer.parseInt(scanner.nextLine());
        int l=Integer.parseInt(scanner.nextLine());
        int h=Integer.parseInt(scanner.nextLine());

        int freeSpace=w*l*h;

        String input=scanner.nextLine();
        int boxes=0;
        while (!"Done".equalsIgnoreCase(input)){
            int numOfBoxes=Integer.parseInt(input);
            boxes+=numOfBoxes;
            if (boxes>=freeSpace){
                break;
            }

            input=scanner.nextLine();
        }
        int result=Math.abs(boxes-freeSpace);
        if (boxes>=freeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.",result);
        }else {
            System.out.printf("%d Cubic meters left.",result);
        }
    }
}
