package com.neven.java.basic.string;

/**
 * @author NevenChen
 * @date 2020/4/15 21:09
 */
public class StringTest {

  public static void main(String[] args) {
      String aa = new String("Huawei");
    String bb = new String("Huawei");
    String a = "Huawei";
    String b = "Huawei";
    System.out.println("Result: " + (aa == bb) + ", " + (a == b) +"," + aa.equals(bb) + "," + (8 == 8.0));
  }

}
