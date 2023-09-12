package _08_07_2023_ConditionalStatements.Tasks;

        import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds=Double.parseDouble(scanner.nextLine());
        double distanceInMeters=Double.parseDouble(scanner.nextLine());
        double timeInSeconds=Double.parseDouble(scanner.nextLine());

        double allTime=distanceInMeters*timeInSeconds;
        double addTime=Math.floor(distanceInMeters/15)*12.5;
        allTime=(allTime+addTime);

  if (recordInSeconds>allTime){
      System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",allTime);
  }else {
      allTime=(allTime-recordInSeconds);
          System.out.printf("No, he failed! He was %.2f seconds slower.",allTime);

  }
    }
}
