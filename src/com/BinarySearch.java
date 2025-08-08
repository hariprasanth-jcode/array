package com;

public class BinarySearch {
public static void main(String[] args) {
	int key=2;
	System.out.println(binarySearch(new int[] {-3, -2, -1, 0, 1, 2, 3},key));
}

public static int binarySearch(int[] a,int key) {
	int low=0;
	int high=a.length-1;
	
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==key) {
			return mid;
		}else if(a[mid]<0) {
			high=mid-1;
		}else {
			low=mid+1;
		}
		
	}
	return -1;
}
}
