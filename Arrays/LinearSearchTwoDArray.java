package com.java.Arrays;

import java.util.Scanner;

public class LinearSearchTwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int rows =sc.nextInt();
		System.out.println("Enter Number of Columns: ");
		int col = sc.nextInt();

		
		int[][] number = new int[rows][col];
		
		//Input
		for(int i = 0; i < rows; i++) {
			for(int j =0; j<col;j++) {
				number[i][j] = sc.nextInt();
			}
		}
		int key = sc.nextInt();
		//output
		sc.close();
		System.out.println("Array Look's Like");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<col;j++) {
//				System.out.print(number[i][j]+ " ");
				
				if(number[i][j] == key)
					System.out.println(key+" is present at Index position "+ "["+i+"]"+ "["+j+"]");
			}
			System.out.println();
		}	
	}
}
