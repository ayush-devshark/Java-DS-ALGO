package Recursion;

public class GCD {
  public static void main(String[] args) {
    int a = 658;
    int b =640;

    System.out.println(gcd(a,b));
  }

  public static int gcd(int a, int b){
    if( a == 0){
      return b;
    }
    return gcd(b%a,a);
  }
}
