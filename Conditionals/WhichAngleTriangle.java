package Conditionals;
import java.util.*;

public class WhichAngleTriangle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int max = 0;
    sc.close();

    if( a > b){
      if(a > c){
        max = a;
      } else{
        max = c;
      }
    } else{
      if(b > c){
        max = b;
      }else{
        max = c;
      }
    }
      if(2*max*max == (a*a)+(b*b)+(c*c)){
        System.out.println(2);
      } else if (2*max*max > (a*a)+(b*b)+(c*c)){
        System.out.println(3);
      } else{
        System.out.println(1);
      }

  }
}
