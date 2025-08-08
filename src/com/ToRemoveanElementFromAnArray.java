package com;

import java.util.Arrays;

public class ToRemoveanElementFromAnArray {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int elementToRemove=3;
	
	int[] newArray = new int[a.length - 1];
	int index = 0;
	
	for (int i = 0; i < a.length; i++) {
		if (a[i] != elementToRemove) {
			newArray[index++] = a[i];
		}
	}
	
	System.out.println(Arrays.toString(newArray));
}
}
