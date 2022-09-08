//Write a java Program to Find Next Greater Element in Array

import java.util.*;

public class NextGreaterElement {
	
	public static void printArray(int[] arr) {

		// Print Array Using for each Loop
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Values in Array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Entered Array: ");
		printArray(arr);
		
		findNextGreaterElement(arr);
		
	}

	public static void findNextGreaterElement(int[] arr) {
		int n = arr.length;
		
		//Creating new Array
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length -1;j++) {
				if(arr[i]< arr[j]) {
					
				}
				
			}
		}
		System.out.println(n);

		
		
		
	}
}
