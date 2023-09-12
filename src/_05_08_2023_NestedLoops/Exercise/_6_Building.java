package _05_08_2023_NestedLoops.Exercise;

import java.util.Scanner;

public class _6_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //брой етажи
        int countFloors = Integer.parseInt(scanner.nextLine());
        //брой стай
        int countRooms = Integer.parseInt(scanner.nextLine());

        //етажи : от последния  към първия
        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room <= countRooms; room++) {
                //проверка на  какъв етаж се намира стаята
                //проверка дали етажа е  последен
                if (floor == countFloors) {
                    System.out.print("L" + floor + room +" ");
                } else if (floor % 2 == 0) {      // проверка дали  етажа е  четен
                    System.out.print("O" + floor + room+" ");
                } else {                      // проверка дали  етажа е  нечетен
                    System.out.print("A" + floor + room+" ");
                }
            }
            System.out.println();
        }
    }
}
