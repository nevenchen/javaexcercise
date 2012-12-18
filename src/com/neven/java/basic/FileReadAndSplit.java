package com.neven.java.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FileReadAndSplit {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\neven's\\testTemplat\\master.txt";
//		System.out.println(getFile(fileName));
		printMap(getCharts(getFile(fileName)));
	}
	
	public static void printMap(Map<String,String> map){
		Set chartTypes = map.keySet();
		Iterator key = chartTypes.iterator();
		while(key.hasNext()){
			String chart = key.next().toString();
			System.out.println(chart+":");
			System.out.println(map.get(chart));
		}
	}
	
	public static Map<String, String> getCharts(String fileText){
		Map<String, String> charts = new HashMap<String, String>();
		String[] blocks = fileText.split("\\|");
		for(String temp : blocks){
			if("".equals(temp)) continue;
			String[] pairs = temp.split(":");
			charts.put(pairs[0], pairs[1]);
		}
		return charts;
	}
	
	public static String getFile(String fileName) throws IOException{
		 File file = new File(fileName);
		  
		  BufferedReader bf = new BufferedReader(new FileReader(file));
		  
		  String content = "";
		  StringBuilder sb = new StringBuilder();
		  
		  while(content != null){
		   content = bf.readLine();
		   
		   if(content == null){
		    break;
		   }
		   if(content.contains("~Type")){
			   content = "|" + content;
			   content = content.replace("~Type,", ":");
		   }
		   
		   sb.append(content + "\n");
		  }
		  
		bf.close();
		  return sb.toString();
	}
}
