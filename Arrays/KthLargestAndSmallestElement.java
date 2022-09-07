package array.sortAndMergeOperations;

import java.util.*;

public class KthLargestAndSmallestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Eneter Values in Array: ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter a new kth Position: ");
		int k = sc.nextInt();
		sc.close();

		kthLargest(arr, k);
		kthsmallest(arr, k);
	}

	public static void kthLargest(int[] arr, int k) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(k + "th largest element: " + arr[i]);
				break;
			}
		}
	}

	public static void kthsmallest(int[] arr, int k) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(k + "th largest element: " + arr[i]);
				break;
			}

		}
	}
}
