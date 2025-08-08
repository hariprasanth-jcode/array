package com;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int [] a= {1,4,-15};
		reverse(a);
  	}
	public static void reverse(int[] a) {
		int i=0;
		int j=a.length-1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
