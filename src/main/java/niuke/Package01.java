package niuke;

import java.util.Scanner;

/**
 * @author NevenChen
 * @date 2020/4/14 21:15
 */
public class Package01 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int c;
    c = Integer.parseInt(input.nextLine());

    String string = input.nextLine();
    String[] wS = string.split(" ");
    int[] w = new int[wS.length + 1];
    int[] v = new int[wS.length + 1];
    for (int i = 0; i < wS.length; i++) {
      w[i + 1] = Integer.parseInt(wS[i]);
      v[i + 1] = input.nextInt();
    }

    int n = wS.length;
    int[][] m = new int[c + 1][c + 1];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= c; j++) {
        if (w[i] <= j) {
          m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - w[i]] + v[i]);
        } else
        {
          m[i][j] = m[i - 1][j];
        }
      }
    }

    int[] x = new int[n + 1];
    for (int i = n; i > 1; i--) {
      if (m[i][c] == m[i - 1][c]) {
        x[i] = 0;
      } else {
        x[i] = 1;
        c -= w[i];
      }
    }
    if (m[1][c] > 0) {
      x[1] = 1;
    }

    boolean isF = true;
    for (int i = 1; i <= n; i++) {
      if (isF && x[i] > 0) {
        isF = false;
        System.out.print(i);
        continue;
      }

      if (!isF && x[i] > 0) {
        System.out.print(" " + i);
      }
    }

  }

}
