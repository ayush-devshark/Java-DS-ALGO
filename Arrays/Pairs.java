package Arrays;

import java.util.*;

public class Pairs {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int [] arr = new int[N];
    int num = 0;
    
    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i<N;i++){
      for(int j = i+1; j<N;j++){
        if(arr[j] - arr[i] == K || arr[i] - arr[j] == K  ){
          num++;
        }
      }
    }
sc.close();
    System.out.println(num);

  }
}
