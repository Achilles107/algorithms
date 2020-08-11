import java.util.*;
public class FibonacciSearch {
	static int search(int arr[], int key, int n) {
		int fib2 = 0;
		int fib1 = 1;
		int fib = fib2 + fib1;
		 while (fib < n) {
			 fib2 = fib1;
			 fib1 = fib;
			 fib = fib2 + fib1; 
		 }
		 int offset = -1;
		 while (fib > 1) {
			 int i = (int) Math.min(offset + fib2, n);
			 if (arr[i]<key) {
				 fib = fib1;
				 fib1 = fib2;
				 fib2 = fib - fib1;
				 offset = i;
			 } else if (arr[i]>key) {
				 fib = fib2;
				 fib1 = fib1 - fib2;
				 fib2 = fib - fib1;
			 } else {
				 return i;
			 }
		 }
		 if (fib1 == 1 && arr[offset+1]==key) {
			 return offset+1;
		 }
		 return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("make sure array is sorted");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Key");
		int key = sc.nextInt();
		System.out.println("Index "+search(arr, key, n));
	}

}
