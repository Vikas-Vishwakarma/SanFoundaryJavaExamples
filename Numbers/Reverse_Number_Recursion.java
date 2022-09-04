//Java Program to Reverse a Number using Recursion

package sanfoundary.Numbers;

import java.util.Scanner;

public class Reverse_Number_Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Program to Reverse a Number using Recursion");
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		reverseNumber(n);
		
	}
	
	public static void reverseNumber(int number) {
		//Base Condition
		if(number == 0) {
			return;
		}
		
		//Logic
		int rem = number%10;
		System.out.print(rem);
		reverseNumber(number/10);
	}
}
