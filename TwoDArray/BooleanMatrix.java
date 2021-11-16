package TwoDArray;

import java.util.*;

public class BooleanMatrix {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m,n;
    m = sc.nextInt();
    n = sc.nextInt();

    int [] []  mat = new int [m][n];

    for(int i = 0;i<m;i++){
      for(int j =0;j<n;j++){
        mat [i][j] = sc.nextInt();
      }
    }

    for(int i = 0;i<m;i++){
      for(int j =0;j<n;j++){
        if(mat[i][j] == 1){
          for(int k = 0;k<n;k++){
            mat[i][k] = 1;
          }
        }
      }
    }

    for(int i = 0;i<m;i++){
      for(int j =0;j<n;j++){
      System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
sc.close();
  }
}
