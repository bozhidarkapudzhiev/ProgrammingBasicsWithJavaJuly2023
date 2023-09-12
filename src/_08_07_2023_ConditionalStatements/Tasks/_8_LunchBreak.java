package _08_07_2023_ConditionalStatements.Tasks;
import java.util.Scanner;
public class _8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName=scanner.nextLine();
        int episodeDuration=Integer.parseInt(scanner.nextLine());
        int durationOfRest=Integer.parseInt(scanner.nextLine());
        double timeForLunch=durationOfRest/8.0;
        double timeForABreak=durationOfRest/4.0;
        double result=durationOfRest-(timeForABreak+timeForLunch);
        double timeLeft=Math.floor(result-episodeDuration);
        if (timeLeft>=0){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName,timeLeft);
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,Math.abs(timeLeft));
        }
    }
}
