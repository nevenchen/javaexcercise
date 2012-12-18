package com.neven.java.basic.sort;

public class SelectSorting {
	
	public static void main(String[] args){
		int[] a = {3,4,1,8,5};
		int[] printData = sortData(a);
		for(int temp : printData){
			System.out.println(temp);
		}
	}
	
	public static int[] sortData(int origenalData[]){
		for(int i = 0; i < origenalData.length-1; i++){
			int k = i;
			for(int j=i; j<origenalData.length; j++){
				if(origenalData[k] > origenalData[j]){
					k=j;
				}
			}
			if(k!=i){
				int temp = origenalData[k];
				origenalData[k] = origenalData[i];
				origenalData[i] = temp;
			}
		}
		return origenalData;
	}

}
