package Loops;
import java.util.Scanner;

public class Armstrong {
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    int N = sc.nextInt();

    sc.close();
    
    int originalN = N;
    int sum = 0;
    while(N > 0){
      int digit = N%10;
      sum += digit*digit*digit;
     N = N/10;
    }
    if(originalN == sum){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
    }
}
