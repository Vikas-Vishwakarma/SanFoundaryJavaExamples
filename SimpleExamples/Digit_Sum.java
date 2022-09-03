// Java Program to Compute the Sum of Digits in a given Integer.

package sanfoundary.Simple;

import java.util.Scanner;

public class Digit_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		int sum =0;
		sc.close();
		
		while(number > 0) {
			int result = number %10;
			sum += result;
			number = number / 10;
		}
		 System.out.println("Sum of Digits:"+sum);
	}

}
