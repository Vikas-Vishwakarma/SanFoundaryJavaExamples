package arrays.insertingAnddeleting;

import java.util.*;

public class InsertElement2 {
	
	public static void printArray(int[] array) {
		System.out.print("Array: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void convertArray(int[] arr, int position, int element) {
		//Converting Array to list
		List<Integer> list = new ArrayList<>();
		Arrays.asList(arr);
		
		//Add element to list
		list.add(position-1, element);
		
		//Converting back to array
	
		 
//		list.toArray(arr);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter values in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Element you want to insert: ");
		int element = sc.nextInt();
		System.out.println("Enter at which position you want to enter: ");
		int position = sc.nextInt();
		sc.close();
		
		//Function to Print Array
		printArray(arr);	
		//Function to Place element at its position
		 convertArray(arr, element, position);
	}
}
