package sanfoundary.Numbers;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		int number = n;
		String s = "";

		while (number > 0) {
			int rem = number % 10;
			s = String.valueOf(s + rem);
			number = number / 10;
		}

		int rem = Integer.parseInt(s);

		if (n == rem)
			System.out.println(rem + " is Palindrome: ");
		else
			System.out.println(rem + " is Not a Palindrome: ");
	}
}
