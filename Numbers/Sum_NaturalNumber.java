//Java Program to Print Sum of N Natural Numbers using Recursion

package sanfoundary.Numbers;

import java.util.Scanner;

public class Sum_NaturalNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to Print Sum of  N Natural Numbers using Recursion");
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		//sumNaturalNumber(Start from 1, To till n, sum =0);	
		
		sumNaturalNumber(1,n,0);
	}
	public static void sumNaturalNumber(int start,int n, int sum) {

		//Base Condition
		if(start > n) {
			System.out.println("Sum: "+sum);
			return;
		}

		//Logic
		sum += start;
		start++;
		sumNaturalNumber(start, n, sum);

	}
}
