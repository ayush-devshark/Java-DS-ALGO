package Sorting;

import java.util.Scanner;

public class InsertionSort_1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }

  insertionSort(arr,n);
  sc.close();
  }

  public static void insertionSort(int[] arr, int n){
      int endVal = arr[n-1];
      int lastIndex = n-1;

      for(int i = n-2;i >= 0;i--){
          if(arr[i]<=endVal){
              break;
          }
          arr[i+1] = arr[i];
          lastIndex = i;

          for(int x: arr){
              System.out.print(x+" ");
          }
          System.out.println();
          
      }

      arr[lastIndex] = endVal;
      for(int x: arr){
              System.out.print(x+" ");
          }
      System.out.println();
  }
 
  }
