package Recursion;

import java.util.*;

public class Hercules {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int j = 0; j<t;j++) {
      int n = sc.nextInt();
      int []arr = new int[n];
      for( int i =0; i<n;i++){
          arr[i] = sc.nextInt();
      }
      int num = j+1;
      System.out.println("Case" +(num)+":"+ hercules(arr, arr.length-1));
    }
    sc.close();
  }

  public static int hercules(int [] arr, int index){
    if(index == 0){
      return arr[0];
    }
     return arr[index] + hercules(arr, index-1);
  }
}
