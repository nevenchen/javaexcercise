package niuke;

/**
 * @author NevenChen
 * @date 2020/4/14 22:07
 */

import java.util.Scanner;

public class ZhiShu {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    while (read.hasNext()) {
      long num = read.nextLong();
      while (num != 1) {
        for (int i = 2; i <= num; i++) {
          if (num % i == 0) {
            System.out.print(i + " ");
            num = num / i;
            break;
          }
        }
      }
    }
  }
}
