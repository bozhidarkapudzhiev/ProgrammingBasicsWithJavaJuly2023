package _05_08_2023_NestedLoops.Exercise;

import java.util.Scanner;

public class _5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        //парите които ще спестяваме

        while (!input.equals("End")){
            //нужни пари за дестинацията
          double neededMoney=Double.parseDouble(scanner.nextLine());
          //спестяване
            // повтаряне: въвеждаме  сума + спестяване
            //стоп: когато >= neededSum
            //продължаваме: спестените пари < neededSum

            double savedMoney=Double.parseDouble(scanner.nextLine());

            while (savedMoney<neededMoney){
                //спестени пари
                double sumForSave=Double.parseDouble(scanner.nextLine());
                savedMoney+=sumForSave;

            }
            System.out.println("Going to "+input+"!");

            input=scanner.nextLine();

      }
    }
}
