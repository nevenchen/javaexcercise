package niuke;
import java.util.Scanner;
/**
 * @author NevenChen
 * @date 2020/4/14 19:10
 */
public class StringLength {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s="";
    while(input.hasNextLine()){
      s=input.nextLine();
      System.out.println(s.length()-1-s.lastIndexOf(" "));
    }
  }

  static int getStringLenght(String string)  {
    if(string != null & !"".equals(string)){
          String[] tempA = string.split(" ");
          String tempStr = tempA.length > 0 ? tempA[tempA.length -1 ] : tempA[1];
         return tempStr.length();
    }else{
      throw new RuntimeException("String is empty");
    }
  }
}
