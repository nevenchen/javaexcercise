package niuke;
import java.util.*;
/**
 * @author NevenChen
 * @date 2020/4/14 21:45
 */
public class CharCount {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String input = read.next();
    char[] arr = input.toCharArray();
    Map<Character, Integer> result = new HashMap<>();
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      if(!result.containsKey(arr[i])) {
        result.put(arr[i], 1);
        sum++;
      }
    }
    System.out.println(sum);
  }
}
