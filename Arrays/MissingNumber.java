package Arrays;
import java.util.Scanner;

public class MissingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int freq1[] = new int [10005];
    for(int i =0;i<n;i++){
        int curVal = sc.nextInt();
        freq1[curVal]++;
    }

     int m = sc.nextInt();
    int freq2[] = new int [10005];
    for(int i =0;i<m;i++){
        int curVal = sc.nextInt();
        freq2[curVal]++;
    }


       for (int i = 0; i<10005;i++){
           if(freq2[i] > freq1[i]){
               System.out.print(i+ " ");
           }
       }

       sc.close();
  }
}
