package niuke;

/**
 * @author NevenChen
 * @date 2020/4/14 22:09
 */
import java.util.*;
public class Get16To10 {

  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    while(read.hasNext()) {
      String str = read.next().substring(2);
      System.out.println(str);
      System.out.println(Integer.parseInt(str, 16));
    }
  }
}
