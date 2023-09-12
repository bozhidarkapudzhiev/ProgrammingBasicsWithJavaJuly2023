package _22_07_2023_ForLoop.Task;

public class _1_NumbersEndingin7 {
    public static void main(String[] args) {
        int n=0;
        for (int i=7;i<=997;i++){
          if( (i%10==7)||(i%100==7)){
              System.out.println(i);
          }
        }
    }
}
