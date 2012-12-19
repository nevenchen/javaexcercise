package com.neven.java.basic.codepiece;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RootTest {
	
	static void createFile(){
		File file = new File("file1.txt");
		try {
			FileOutputStream out = new FileOutputStream(file);
			out.write(new byte[]{1});
			out.flush();out.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		System.out.println(RootTest.class.getClassLoader().getResource(""));
		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(RootTest.class.getResource(""));
		System.out.println(RootTest.class.getResource("/")); // Classæ–‡ä»¶æ‰?œ¨è·¯å¾„
		System.out.println(new File("file.txt1").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		createFile();
	}
}
