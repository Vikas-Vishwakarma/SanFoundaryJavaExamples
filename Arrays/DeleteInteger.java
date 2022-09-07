//Write a java program to delete an Specified Integer from Array
package arrays.insertingAnddeleting;

import java.util.Scanner;

public class DeleteInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter values in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		System.out.println("Entered Array: ");
		printArray(arr);
		
		System.out.print("Enter element you want to delete: ");
		int element = sc.nextInt();
		
		sc.close();
		
		deleteInteger(arr, element);
	}

	public static void deleteInteger(int[] arr, int element) {
		int[] copyArray = new int[arr.length-1];

		for(int i =0; i<copyArray.length;i++) {
			
			if(arr[i] < element) {
				copyArray[i] = arr[i];
			}else if (arr[i] == element) {
				copyArray[i] = arr[i+1];
			}else if (arr[i] > element) {
				copyArray[i] = arr[i+1];
			}
		}
		printArray(copyArray);
	}
	
	public static void printArray(int[] array) {
		System.out.print("Array: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
