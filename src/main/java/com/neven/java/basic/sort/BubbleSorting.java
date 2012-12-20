package com.neven.java.basic.sort;

public class BubbleSorting {
	public static void main(String[] args){
		int[] a = {3,4,1,8,5};
		int[] printData = sortData(a);
		for(int temp : printData){
			System.out.println(temp);
		}
	}
	
	public static int[] sortData(int origenalData[]){
		for(int i = 0; i < origenalData.length-1; i++){
			for(int j=i+1; j<origenalData.length; j++){
				if(origenalData[i] < origenalData[j]){
					int temp = origenalData[i];
					origenalData[i] = origenalData[j];
					origenalData[j] = temp;
				}
			}
		}
		return origenalData;
	}
}
