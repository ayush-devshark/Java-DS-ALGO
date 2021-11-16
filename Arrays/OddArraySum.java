package Arrays;

import java.util.Scanner;

public class OddArraySum {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String str  = sc.nextLine();
     String arr [] = str.split(" ");
 int num = 0;
     for(int i = 0;i<arr.length;i++){
         int x = Integer.parseInt(arr[i]);
          if(x%2!=0){
                 num+=x;
             }
     }
     System.out.println(num);
     sc.close();
  }
}
