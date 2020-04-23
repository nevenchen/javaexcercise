package com.neven.java.basic.string;

import java.util.ArrayList;

/**
 * @author NevenChen
 * @date 2020/4/15 21:05
 */
public class ArrayTest {

  public static void main(String[] args) {
    ArrayList huawwei = new ArrayList(5);
    huawwei.add(1);
    huawwei.add(2);
    huawwei.add(3);
    huawwei.add(4);
    huawwei.add(5);

    huawwei.remove(3);
    System.out.println(huawwei.get(3));
  }
}
