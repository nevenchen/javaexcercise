package niuke;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author NevenChen
 * @date 2020/4/14 21:51
 */
public class HeBingRecord {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int num = read.nextInt();
    Map<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < num; i++) {
      int key = read.nextInt();
      int value = read.nextInt();
      if (map.containsKey(key)) {
        map.put(key, map.get(key) + value);
      } else {
        map.put(key, value);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
