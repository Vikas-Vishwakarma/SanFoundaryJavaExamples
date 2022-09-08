//Java Program to Count the Number of Occurrence of an Element in an Array

package sanfoundary.Arrays;

import java.util.*;


public class CountOccurence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =0;
		
		//Taking size of Array One
		try {
			System.out.println("Enter size of Array One: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		
		int[] array = new int[n];
		
		//Taking values in Array One
		
		try {
		System.out.println("Enter Values in Array: " );
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		}catch (Exception e) {
			System.out.println("Invalid Input");
		}
		System.out.println("Enter Element you want find number of Occurence: ");
		int key = sc.nextInt();
		count(array, key);
		sc.close();
	}
	
	public static void count(int[] arr, int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		System.out.println(key +" Occurence "+count);
	}
}
