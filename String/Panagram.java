package String;

import java.util.Scanner;

public class Panagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();

    int freq [] = new int[256];
    int length = str.length();

    for(int i = 0;i<length;i++){
        if(str.charAt(i) ==' '){
            continue;
        }
        freq[(int)str.charAt(i) - (int)'a']++;
    }
    boolean panagram = true;

    for(int j =0; j<26;j++){
        if(freq[j] == 0){
            panagram = false;
        }
    }
    if(panagram){
        System.out.println("pangram");
    } else{
         System.out.println("not pangram");
    }
    sc.close();
  }
}
