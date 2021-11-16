package String;
import java.util.*;

public class Ptice {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String adr = "ABC";
    String bru = "BABC";
    String gor = "CCAABB";

    int n = sc.nextInt();
    
    String ans = sc.next();

    int adr1 = 0;
    int bru1 = 0;
    int gor1 = 0;
   
    while(adr.length() <n){
      adr += "ABC";
    }
    while(bru.length() <n){
      bru += "BABC";
    }
    while(gor.length() <n){
      gor += "CCAABB";
    }


    for(int i =0;i<n;i++){
      if(ans.charAt(i) == adr.charAt(i)){
        adr1++;
      }
      if(ans.charAt(i) == bru.charAt(i)){
        bru1++;
      }
      if(ans.charAt(i) == gor.charAt(i)){
        gor1++;
      }
    }

   int maxScore = Math.max(adr1, Math.max(bru1, gor1));

   System.out.println(maxScore);

   if(maxScore == adr1){
     System.out.println("Adrian");
   }
    if( maxScore == bru1){
    System.out.println("Bruno");
   } 
   if(maxScore == gor1){
    System.out.println("Goran");
   }

   sc.close();
  }

}
