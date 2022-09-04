//Java Program to  Print first n Natural Numbers using Recursion

package sanfoundary.Numbers;

import java.util.Scanner;

public class Print_NaturalNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to  Print first n Natural Numbers using Recursion");
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		//sumNaturalNumber(Start from 1, To till n, sum =0);
		sumNaturalNumber(1,n);
	}
	public static void sumNaturalNumber(int start,int n) {

		//Base Condition
		if(start > n) {
			return;
		}

		//Logic
		System.out.print(start+" ");
		start++;
		sumNaturalNumber(start, n);

	}
}
