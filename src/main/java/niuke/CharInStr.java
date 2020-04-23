package niuke;

import java.util.Scanner;

/**
 * @author NevenChen
 * @date 2020/4/14 20:06
 */
public class CharInStr {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = "";
    while (scanner.hasNextLine()) {
      s = scanner.nextLine();
    }

//    compare(s,c),
  }

  static int compare(String str, char flag) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == flag) {
        count++;
      }
    }
    return count;
  }
}
