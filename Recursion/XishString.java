package Recursion;

public class XishString {
  public static void main(String[] args) {
    String  str = "peakcock";
    String x_string = "aek";
    for( int i =0;i<x_string.length();i++){
      if(!(xishString(str, x_string.charAt(i), 0 ))){
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");
  }

  public static boolean xishString(String s, char c, int currIndex){
    if( currIndex == s.length()){
      return false;
    }

    if(c == s.charAt(currIndex)){
      return true;
    }

    return xishString(s, c, currIndex+1);
  }
}
