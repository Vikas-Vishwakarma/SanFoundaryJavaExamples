//Find Number of Elements in an Array in Java.
//Java	Java Program to Find the Number of Elements in an Array

import java.util.Scanner;

public class NumberOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Values in Array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Entered Array: ");

		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		numberOfElement(arr);
	}
	
	public static void numberOfElement(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println();
		System.out.println("Number of Element: "+count);
	}
	
}
