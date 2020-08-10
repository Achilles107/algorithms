import java.util.*;
public class JumpSearch {

	static int search(int arr[], int key) {
		int jump = (int) Math.sqrt(arr.length);
		int size = arr.length;
		for (int i=0; i<size; i+=jump) {
			int j = i;
			if (arr[i] == key) {
				return i;
			}
			if (arr[i]>key) {
				size = i+1;
				i -= jump;
				jump = (int) Math.sqrt(size-i);
				
			} 
			
		}
		if (arr[size-1]==key) {
			return size-1;
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int size = sc.nextInt();
		System.out.println("Make sure your array is sorted");
		int arr[] = new int[size];
		for (int i = 0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Key");
		int key = sc.nextInt();
		System.out.println(search(arr, key));
	}
}
