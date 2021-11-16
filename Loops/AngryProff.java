package Loops;

import java.util.Scanner;

public class AngryProff {
  public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i = 0; i<num;i++){
      int n = sc.nextInt();
      int k = sc.nextInt();

      int [] arr = new int[n];

      for(int j = 0 ;j<n;j++){
        arr[j] = sc.nextInt();
      }

      int before = 0;

      for(int x: arr){
        if( x <= 0){
          before++;
        }
      }

      if(before >= k){
        System.out.println("NO");
      } else{
        System.out.println("YES");
      }
    }
    sc.close();
    }
  }

