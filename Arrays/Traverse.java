package com.java.Arrays;

import java.util.Scanner;

public class Traverse {

	public static void main(String[] args) {
		insertValues();
	}
	
	private static void insertValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter values in Array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();	
		traverse(arr, size);
	}

	public static void traverse(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
