import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	static public int search(int arr[], int len, int key) {
		if (arr[0]==key)
			return 0;
		int i = 1;
		//finding the index
		while (i < len && arr[i] <= key) {
			i = i*2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i, len), key);
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int len = sc.nextInt();
		System.out.println("Make sure array is sorted");
		int arr[] = new int[len];
		for (int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Key to be searched");
		int key = sc.nextInt();
		if (search(arr, len, key) < 0)
			System.out.println(-1);
		else
			System.out.println(search(arr, len, key));
		
	}
}
