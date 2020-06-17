package com.neven.java.lambada;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NevenChen
 * @date 2020/4/27 11:05
 */
public class FlatMapTest {


  public static void main(String args[]) {
    hl1();
    hl2();
  }

  public static void hl2(){
    String[] words = new String[]{"Hello", "World"};
    List<String[]> a = Arrays.stream(words)
        .map(word -> word.split(""))
        .distinct()
        .collect(toList());
    a.forEach(System.out::print);

  }
  public static void hl1(){
    String[] words = new String[]{"Hello","World"};
    List<String> a = Arrays.stream(words)
        .map(word -> word.split(""))
        .flatMap(Arrays::stream)
        .distinct()
        .collect(toList());
    a.forEach(System.out::print);
  }
}
