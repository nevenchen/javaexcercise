package com.neven.java.basic.sort;

public class InsertSorting {
	
	public static void main(String[] args) {
		int[] a = { 3, 4, 1, 8, 5 };
		int[] printData = insertSort(a);
		for (int temp : printData) {
			System.out.println(temp);
		}
	}

	public static int[] insertSort(int[] elements) {
		for (int i = 1; i < elements.length; i++) {
			int j = -1;
			while (j <= i && elements[i] > elements[++j])
				;// 找到element[i]应该摆放的位置，此处可以利用查找算法进行优化
			if (j < i) {
				// 将j之后的数据移动一位，然后把elements[i]移动到j处
				int temp = elements[i];
				for (int k = i - 1; k >= j; k--) {
					elements[k + 1] = elements[k];
				}
				elements[j] = temp;
			}
		}

		return elements;
	}
}
