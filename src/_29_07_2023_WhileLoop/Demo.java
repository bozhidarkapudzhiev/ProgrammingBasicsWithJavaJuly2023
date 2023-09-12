package _29_07_2023_WhileLoop;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//Няма стъпка на увеличение
 //  Infinite loop
//   Безкраен цикъл
     /*   for (int i = 1; i <=3 ; ) {
            System.out.println(i);
        }*/
//Валидна дефиниция
     /*   for ( ; ; ) {
            System.out.println("SoftUni");
        }*/

        /* Винаги връща 0 - Infinite loop
        for (int i = 0; i <2 ; i+=0.5) {
            System.out.println(i);
        }*/

        /* за извършим събитране  на числата във for-цикъла
        трябва да бъде примитивен тип  (double i=0;)*/

        //i=i+(int)0.5 cast double  към  int
     /*   for (double i=0;i<=2;i+=0.5){
            System.out.println(i);
        }**/

        //Числата от 1 до 10 разлика между   for  и  while

        //for-loop

      /*  for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
      */

        // while-loop
       /* int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }*/

        /*while (true){
            System.out.println("Hello");
        }*/


      /*  int a=5;
        switch (a){
            case 3:
                System.out.println(a);
            case 5:
                System.out.println(a+a);
                break;
            default:
                System.out.println(a+a+a);
                break;
        }
        while (true){
            if (a>=100){
                break;
            }
            System.out.println(a);
        }*/


      /*  Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        while (name.equals("SoftUni")){
            System.out.println(name);
           name =scanner.nextLine();
        }*/

     /*   for (int i = 0; i < 10; i++) {
            if (i>=3){
                break;
            }
            System.out.println(i);

        }*/

     /*   for (int i = 1; i <=100; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println("The number is:"+i);
        }*/

      /*  int num=1;
        while (num>100){
            num++;
            if (num%2==0){
                continue;
            }
            System.out.println("The number is:"+num);
        }*/
    }
}
