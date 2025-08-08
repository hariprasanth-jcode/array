package com;

import java.util.Arrays;

public class ToInsertElementInanArray {
public static void main(String[] args) {
	int[] a= {1,2,3};
	
	int elementToInsert = 4;
	int indexToInsert = 1; // Index at which to insert the element
	
	int[] newArray = new int[a.length + 1];
	
	for(int i=0;i<indexToInsert;i++) {
		newArray[i]=a[i];
	}
	newArray[indexToInsert] = elementToInsert;
	for(int i=indexToInsert;i<a.length;i++) {
		newArray[i+1]=a[i];
    }
	System.out.println(Arrays.toString(newArray));
	}
	
	
}

