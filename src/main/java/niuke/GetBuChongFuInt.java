package niuke;

/**
 * @author NevenChen
 * @date 2020/4/14 21:49
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetBuChongFuInt {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int num = read.nextInt();
    List<Integer> list = new ArrayList<>();
    while (num > 0) {
      if (list.contains(num % 10)) {
        num = num / 10;
        continue;
      } else {
        list.add(num % 10);
        num = num / 10;
      }
    }
    for (
        Integer i : list) {
      System.out.print(i);
    }
  }
}
