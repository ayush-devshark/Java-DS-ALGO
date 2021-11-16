package TwoDArray;

import java.util.Scanner;
public class DiagnolDiff {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    int [] [] mat  = new int[n][n];

    for(int i=0;i<n;i++){
      for(int j = 0;j<n;j++){
        mat [i][j] = sc.nextInt();
      }
    }

    int left = 0;
    int right = 0;

    for(int i=0;i<n;i++){
      for(int j = 0;j<n;j++){
        if( i == j){
          left += mat [i][j];
        } 
        if( i+j == n-1){
          right += mat[i][j]; 
        }
      }
    }
sc.close();
System.out.println(Math.abs(left-right));
  }
}
