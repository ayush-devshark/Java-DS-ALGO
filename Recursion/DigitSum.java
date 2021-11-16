package Recursion;

public class DigitSum {
  public static void main(String[] args) {
    String n = "148";
    int repeat = 3;
    long sum = 0;

    for(int i =0; i<n.length();i++){
        sum += n.charAt(i) - '0';
    }
    sum *= repeat;
    System.out.println(digitSum(sum));
  }

  public static long digitSum(long n){
    if(n/10 == 0){
      return n;
    }
    long sum = 0;
    while( n> 0){
      sum += n%10;
      n = n/10;
    }
    return digitSum(sum);
  }
}
