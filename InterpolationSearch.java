import java.util.Scanner;

public class InterpolationSearch {

	static int search(int arr[], int key, int low, int high) {
		if (low == high) {
			if (arr[low] == key)
				return low;
			else
				return -1;
		}
		int pos = low + (((key-arr[low])*(high-low))/(arr[high]-arr[low]));
		if (arr[pos] == key)
			return pos;
		if (arr[pos]<key)
			return search(arr, key, pos+1, high);
		else
			return search(arr, key, low, pos-1);
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Make sure elements are sorted");
		for (int i=0; i<n;i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println("Key to find");
		int key = sc.nextInt();
		System.out.println("Index: " + search(arr, key, 0, n-1));
	}
}
