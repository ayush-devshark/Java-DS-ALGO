package Conditionals;
import java.util.*;

public class LeapYear {
  public static void main(String args[]){
    int year;
    Scanner sc = new Scanner (System.in);
    year = sc.nextInt();
    sc.close();

    if(year % 400 ==0){
      System.out.println(1);
    }else if(year %100 == 0){
        System.out.println(0);
    }else if(year % 4 == 0){
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  };
}
