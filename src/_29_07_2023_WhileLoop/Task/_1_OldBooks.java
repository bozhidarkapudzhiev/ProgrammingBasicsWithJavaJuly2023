package _29_07_2023_WhileLoop.Task;


import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName=scanner.nextLine();
        String input=scanner.nextLine();
        String command="No More Books";
        int bookCount=0;
        boolean isBookFound=false;
        while(!command.equals(input)){
            if (bookName.equals(input)){
                isBookFound=true;
                break;
            }
            ++bookCount;
            input=scanner.nextLine();
        }
        if (!isBookFound){
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n",bookCount);
        }else {
            System.out.printf("You checked %d books and found it.",bookCount);
        }
    }
}
