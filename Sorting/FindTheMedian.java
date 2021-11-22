package Sorting;

import java.util.Arrays;

public class FindTheMedian {
  public static void main(String[] args) {
    // Middlemost element after sorting
    int [] arr = {0 ,1 ,2, 4, 6, 5, 3};
    findMedian(arr);
  }

  public static void findMedian(int[] arr){
    Arrays.sort(arr, 0, arr.length); // n(logn) - time complexity
    int mid = arr.length/2;
    System.out.print(arr[mid]);
  }
}
