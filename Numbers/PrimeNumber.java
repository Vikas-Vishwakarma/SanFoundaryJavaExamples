//Java Program to Check Prime Number

package sanfoundary.Numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		// Prime Number - The number which is divisible by 1 and itself
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check Prime Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean flag = false;

		if (n == 0 || n == 1) {
			System.out.println("Not a Prime Number.");
		} else {
			// Prime Number
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}
