package com.neven.java.basic.io;
import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class FileTest {
	private static int i = 0;
	public static void main(String args[]) throws Exception{
//		File file = new File("D:\\download\\WebRightTest\\disk2\\005\\548");
//		File[] files = file.listFiles();
//		for(File fil : files){
//			System.out.println(fil.getName());
//		}
//		String path = "D:"+File.separator+"Downloads";
//		findAllFile(path);
//		File file = new File(path);
//		List<File> files = findAllFiles(file);
//		System.out.println(files.size());
		createTempFile();
		
	}
	
	static void method(){
		System.out.println("pathSeparator: "+File.pathSeparator);
		System.out.println("separator: "+File.separator);
		System.out.println("pathSeparatorChar: "+File.pathSeparatorChar);
	}
	
	static void findAllFile(String path){
		File file = new File(path);
		File[] files = file.listFiles();
		for(File temp: files){
			if(temp.isDirectory()){
				findAllFile(temp.getPath());
				org.apache.commons.beanutils.BeanPrinter.printBean(temp);
			}
			System.out.println(temp.getName()+"-------------"+i++);
		}
	}
	
	static List<File> findAllFiles(File file){
		List<File> files = new ArrayList<File>();
		File[] temps =  file.listFiles();
		for(File temp : temps){
			if(temp.isDirectory()){
				files.addAll(findAllFiles(temp));
			}else{
				files.add(temp);
			}
		}
		return files;
	}
	
	static void createTempFile() throws Exception{
		File tmpFile = File.createTempFile("Za/NwpdO0Eq+ZV1D4qpi+Q==", null);
		System.out.println(tmpFile.getAbsolutePath());
	}
	
}
