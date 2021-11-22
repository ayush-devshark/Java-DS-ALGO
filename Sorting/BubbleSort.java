package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = {6,4,1};

    bubbleSort(arr);
  }

  public static void bubbleSort(int []arr){
    int swapCount = 0;
    int n = arr.length;

    for(int i = 0; i<n;i++){
      for(int j = 0;j<n-1-i;j++){

        if(arr[j] > arr[j+1]){
          swapCount++;

          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }

    }

    System.out.println("Swap Count: "+swapCount);
    System.out.println("First Element: "+arr[0]);
    System.out.println("Last Element: "+ arr[n-1]);

  }
}
