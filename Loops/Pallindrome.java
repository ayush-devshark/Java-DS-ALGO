package Loops;
import java.util.*;

public class Pallindrome {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int originalN = N;
    
    sc.close();

    int temp  = 0;
    while(N >0){
      int digit = N%10;
      temp = temp*10 + (digit);
      N = N/10;
    }
    if(temp == originalN){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }
}
