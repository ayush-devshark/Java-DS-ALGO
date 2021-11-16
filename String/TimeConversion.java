package String;
import java.util.*;

public class TimeConversion {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String time = sc.next();

    char ampm = time.charAt(8);

    int hrVal = Integer.parseInt(time.substring(0,2));
    hrVal %= 12;

    String hrValStr;

    if(ampm == 'P'){
      hrVal += 12;
      hrValStr = String.valueOf(hrVal);
      System.out.println(hrValStr+time.substring(2, 8));
    }else{
      if(hrVal < 10){
        hrValStr = "0"+String.valueOf(hrVal);
      }else{
        hrValStr = String.valueOf(hrVal);
      }
      System.out.println(hrValStr+time.substring(2,8));

    }
sc.close();
  }
}
