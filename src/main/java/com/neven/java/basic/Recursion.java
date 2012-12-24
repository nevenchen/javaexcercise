package com.neven.java.basic;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Recursion {

	static int multiply(int n) {
		if (n == 1 || n == 0)
			return n;
		else
			return n * multiply(n - 1);
	}

	@Test
	public void ten2oneTimes() {
		System.out.println(multiply(10));
	}
	@Test
	public void listAllFiles(){
		System.out.println(listAllFiles(new File("C:\\Temp\\axis")));
	}
	public List<String> listAllFiles(File file){
		List<String> allFiles = new LinkedList<String>();
		for(File tempFile : file.listFiles()){
			if(tempFile.isFile()){
				allFiles.add(tempFile.getName());
			}
			if(tempFile.isDirectory()){
				allFiles.addAll(listAllFiles(tempFile));
			}
		}
		return allFiles;
	}
}
