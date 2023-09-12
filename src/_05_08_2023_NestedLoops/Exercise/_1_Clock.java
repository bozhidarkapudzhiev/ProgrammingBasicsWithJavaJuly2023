package _05_08_2023_NestedLoops.Exercise;

public class _1_Clock {
    public static void main(String[] args) {
        //часове 0 до 23
        //
        for (int hour=0;hour<=23;hour++){
            for (int minutes=0;minutes<=59;minutes++){
                System.out.println(hour+":"+minutes);
                if (hour==23&& minutes==59){
                    hour=0;
                    minutes=0;

                }

            }

        }
    }
}
