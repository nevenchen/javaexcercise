package com.neven.java.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ByteStream2CharStream {
	
	public static void main(String[] args) throws Exception{
		InputStream in = new FileInputStream("D:/temp/Hello.JWS");
		OutputStream out = new FileOutputStream("D:/temp/outputstream.JWS");
		byte[] bbuf = new byte[in.available()];
		System.out.println();
		in.read(bbuf);
		for(Byte b : bbuf){
			System.out.print(b.doubleValue());
		}
		out.write(bbuf);
		out.flush();
		
		InputStream in2 = new FileInputStream("D:/temp/Hello.JWS");
		System.out.println();
		Reader reader = new InputStreamReader(in2,"GBK");
		Writer writer = new FileWriter("D:/temp/filewriter.jws");
		char[] cbuf = new char[1];
		System.out.println();
		reader.read(cbuf);
		System.out.print(cbuf[0]);
		for(Character b : cbuf){
			System.out.print(b-0);
		}
		writer.write(cbuf);
		writer.flush();
//		BufferedReader br = new BufferedReader(reader);
//		BufferedWriter bw = new BufferedWriter(writer);
//		String temps = null;
//		temps = br.readLine();
//		while(temps!=null){
//			bw.write(temps);
//			temps = br.readLine();
//		}
//		bw.flush();
	}
}
