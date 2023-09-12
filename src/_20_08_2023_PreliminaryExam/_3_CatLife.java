package _20_08_2023_PreliminaryExam;

import java.util.Scanner;

public class _3_CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String breedOfTheCat=scanner.nextLine();
         String sexOfTheCat=scanner.nextLine();
         int years=0;
         int mount=0;

         /*
         *
         * "British Shorthair", "Siamese", "Persian", "Ragdoll", "American Shorthair" или "Siberian"
         * */


         if (breedOfTheCat.equals("British Shorthair")||breedOfTheCat.equals("Siamese")||breedOfTheCat.equals("Persian")||
                 breedOfTheCat.equals("Ragdoll")||breedOfTheCat.equals("American Shorthair")||breedOfTheCat.equals("Siberian")){
             switch ( breedOfTheCat){
                 case "British Shorthair":
                     if (sexOfTheCat.equals("m")){
                         years=13*12;
                         mount=years/6;
                     } else if (sexOfTheCat.equals("f")) {
                         years=14*12;
                         mount=years/6;
                     }
                     break;
                 case "Siamese":
                     if (sexOfTheCat.equals("m")){
                         years=15*12;
                         mount=years/6;
                     } else if (sexOfTheCat.equals("f")) {
                         years=16*12;
                         mount=years/6;
                     }
                     break;
                 case  "Persian":
                     if (sexOfTheCat.equals("m")){
                         years=14*12;
                         mount=years/6;
                     }else if (sexOfTheCat.equals("f")){
                         years=15*12;
                         mount=years/6;
                     }
                     break;
                 case "Ragdoll":
                     if (sexOfTheCat.equals("m")){
                         years=16*12;
                         mount=years/6;
                     }else if (sexOfTheCat.equals("f")){
                         years=17*12;
                         mount=years/6;
                     }
                     break;
                 case "American Shorthair":
                     if (sexOfTheCat.equals("m")){
                         years=12*12;
                         mount=years/6;
                     }else if (sexOfTheCat.equals("f")){
                         years=13*12;
                         mount=years/6;
                     }
                 case "Siberian":
                     if (sexOfTheCat.equals("m")){
                         years=11*12;
                         mount=years/6;
                     }else if (sexOfTheCat.equals("f")){
                         years=12*12;
                         mount=years/6;
                     }
             }
             System.out.printf("%d cat months",mount);
         }else {
             System.out.printf("%s is invalid cat!",breedOfTheCat);
         }



    }
}
