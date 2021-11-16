package String;

import java.util.Scanner;

public class LineThemUp {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String arr[] = new String[n];
  for(int i = 0;i<n;i++){
      arr[i] = sc.next();
  }
 boolean increasing  = arr[0].compareTo(arr[1]) < 0 ? true: false;
 boolean decreasing = arr[0].compareTo(arr[1]) > 0 ? true: false;

 for(int i = 2;i<n;i++){
     int com = arr[i].compareTo(arr[i-1]);
     if( increasing && com<0){
         increasing  = false;
     }
     if( decreasing && com>0){
         decreasing = false;
     }
 }

 if(increasing){
     System.out.println("INCREASING");
 } else if (decreasing){
     System.out.println("DECREASING");
 }else{
     System.out.println("NEITHER");
 }
 sc.close();
}
}
