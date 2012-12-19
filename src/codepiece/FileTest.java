package codepiece;
import java.io.File;



public class FileTest {
	public static void main(String args[]){
//		File file = new File("D:\\download\\WebRightTest\\disk2\\005\\548");
//		File[] files = file.listFiles();
//		for(File fil : files){
//			System.out.println(fil.getName());
//		}
//		String path = "D:"+File.separator+"Downloads";
//		findAllFile(path);
		System.out.println("\\\'");
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
			}
			System.out.println(temp.getName());
		}
	}
}
