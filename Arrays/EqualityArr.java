package Arrays;

import java.util.*;

public class EqualityArr {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    int [] arr = new int[n];

    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
 

    int [] freq = new int[100];
    int maxFreq = 0;

    for(int i =0;i<n;i++){
      freq[arr[i]]++;
      if(maxFreq < freq[arr[i]]){
        maxFreq = freq[arr[i]];
      } 
    }
      sc.close();
    System.out.println(n-maxFreq);

  }
  
}
