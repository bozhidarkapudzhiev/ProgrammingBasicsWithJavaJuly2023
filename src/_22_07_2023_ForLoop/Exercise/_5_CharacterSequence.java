package _22_07_2023_ForLoop.Exercise;

import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        for (int i=0;i<input.length();i++){
            System.out.println(input.charAt(i));
        }
    }
}
