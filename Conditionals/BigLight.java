package Conditionals;

import java.util.Scanner;

public class BigLight {
  public static void main(String[] args) {
    
    Scanner sc  = new Scanner(System.in);
    int gianHeight = sc.nextInt();
    int sunHeight =  sc.nextInt();
    int gianSpeed = sc.nextInt();
    int sunSpeed = sc.nextInt();
  
    boolean b = false;
    sc.close();
  
  while(gianHeight > sunHeight){
    gianHeight = gianHeight+gianSpeed;
    sunHeight = sunHeight+sunSpeed;}
  if(gianHeight == sunHeight){
        b = true;
    }
  
  if(b){
    System.out.println("true");
  }
  else{System.out.println("false");}
  }
}

