package com.neven.java.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author NevenChen
 * @date 2020/3/20 10:00
 */
public class OneSockertPerThread  {
  public static void main(String[] args) {
    try {
      ServerSocket ss =
          new ServerSocket(7000);
      while (!Thread.interrupted()) {
        System.out.println("111");
        new Thread(new Handler(ss.accept())).start();
        //创建新线程来handle
        // or, single-threaded, or a thread pool

        System.out.println("222");
      }
    } catch (Exception e) { /* ... */ }
  }


  }

  class Handler implements Runnable {
    final Socket socket;
    Handler(Socket s) { socket = s; }
    @Override
    public void run() {


      System.out.println("333");
      try {
        byte[] input = new byte[1024];
        socket.getInputStream().read(input);
        byte[] output = process(input);
        socket.getOutputStream().write(output);
      } catch (IOException ex) { /* ... */ }
    }
    private byte[] process(byte[] input) {
      byte[] output=null;
      /* ... */
      return output;
    }
  }