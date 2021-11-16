package Arrays;

import java.util.Scanner;

public class CircularArrayRotation {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();

    int arr [] = new int[N];
    int rotArr [ ] = new int[N];

    for(int i=0; i<N; i++){
      arr[i] = sc.nextInt();
    }

    for(int i =0;i<N;i++){
      int idx = (i+K) % N;
      rotArr[idx] = arr[i];
    }

    for(int i = 0; i<Q; i++){
      int index = sc.nextInt();
      System.out.println(rotArr[index]);
    }
sc.close();
  }
}
