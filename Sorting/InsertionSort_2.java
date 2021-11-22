package Sorting;

import java.util.Scanner;

public class InsertionSort_2 {
  public static void printArray(int arr[], int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void insertAtCorrectPos(int arr[], int n){
    int endVal = arr[n-1];
    int lastIndexUpdated = n-1;
    for(int i=n-2;i>=0;i--){
        if(arr[i]<=endVal){
            break;
        }
        arr[i+1] = arr[i];
        lastIndexUpdated = i;
    }
    arr[lastIndexUpdated] = endVal;
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    for(int i=1;i<n;i++){
        insertAtCorrectPos(arr,i+1);
        printArray(arr,n);
    }
    sc.close();
}
}
