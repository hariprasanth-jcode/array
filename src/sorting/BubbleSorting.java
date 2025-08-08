package sorting;

public class BubbleSorting {
public static void main(String[] args) {
	
	int[] a = { 5, 3, 8, 4, 2, 1, 7, 6 };
	System.out.println("Before Sorting:");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}

	Bubble(a);

	System.out.println("\nAfter Sorting:");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
}
public static void Bubble(int[] a) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
