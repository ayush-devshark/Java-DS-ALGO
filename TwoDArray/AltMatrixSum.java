package TwoDArray;

import java.util.*;
public class AltMatrixSum {
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  int [][] matrix = new int [n][n];

  for(int i = 0;i<n;i++){
    for(int j=0;j<n;j++){
          matrix[i][j] = sc.nextInt();
    }
  }

  int black = 0;
  int white = 0;

  for(int i = 0;i<n;i++){
    for(int j=0;j<n;j++){
          if((i+j)%2 == 0){
            black += matrix[i][j];
          }else{
            white += matrix[i][j];
          }
    }
  }
  sc.close();
  System.out.println(black);
  System.out.println(white);
}
}