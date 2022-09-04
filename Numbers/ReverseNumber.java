//Write a java class to reverse a number

package sanfoundary.Numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		sc.close();
		
//		System.out.println("Entered Number: "+number);
		System.out.print("Reversed Number: ");
		
		while(number > 0) {
			int rem = number%10;
			System.out.print(rem);
			number = number/10;
		}
	}
}
