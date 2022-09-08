//Java Program to Merge Two Arrays

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0 , m = 0;
		
		//Taking size of Array One
		try {
			System.out.println("Enter size of Array One: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		
		int[] arrayOne = new int[n];
		
		//Taking values in Array One
		
		try {
		System.out.println("Enter Values in Array One: " );
		for(int i=0;i<n;i++) {
			arrayOne[i] = sc.nextInt();
		}
		}catch (Exception e) {
			System.out.println("Invalid Input");
		}
				
		//Taking size of Array One
		try {
			System.out.println("Enter size of Array Two: ");
			m = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		
		int[] arrayTwo = new int[m];
		
		//Taking values in Array Two
		
		try {
		System.out.println("Enter Values in Array Two: " );
		for(int i=0;i<n;i++) {
			arrayTwo[i] = sc.nextInt();
		}
		}catch (Exception e) {
			System.out.println("Invalid Input");
		}
		
		merge(arrayOne, arrayTwo);
		sc.close();
	}
	
	
	public static void merge(int[] arrayOne , int[] arrayTwo) {
		int n = arrayOne.length;
		int m = arrayTwo.length;
		int[] mergeArray = new int[n+m];
		
		for(int i =0;i<n;i++) {
			mergeArray[i] = arrayOne[i];
		}
		
		for(int i=0;i<m;i++) {
			mergeArray[n+i] = arrayTwo[i];
		}
		System.out.println("Merged Array One and Array Two");
		for(int i : mergeArray) {
			System.out.print(i+" ");
		}
	}

}
