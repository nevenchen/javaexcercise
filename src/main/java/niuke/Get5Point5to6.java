package niuke;

/**
 * @author NevenChen
 * @date 2020/4/14 21:56
 */

import java.util.Scanner;

public class Get5Point5to6 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    while (read.hasNext()) {
      float num = read.nextFloat();
      System.out.println("num:" + (int)Math.ceil(num-0.5));
      float temp = num;
      temp = temp - (int) temp;
      if (temp >= 0.5) {
        System.out.println((int) num + 1);
      } else {
        System.out.println((int) num);
      }
    }
  }
}
