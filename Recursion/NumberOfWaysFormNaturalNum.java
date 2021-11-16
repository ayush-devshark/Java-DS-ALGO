package Recursion;

public class NumberOfWaysFormNaturalNum {
  public static void main(String[] args) {
    int n = 6;
    System.out.print(getAns(1,n));
  }

  public static int getAns(int currVal, int num){
    if( num == 0) return 1;
    if( currVal > num) return 0;
    return getAns(currVal+1, num-currVal) + getAns(currVal+1,num);
  }
}
