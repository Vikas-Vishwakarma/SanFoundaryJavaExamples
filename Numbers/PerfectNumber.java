//Write a Java Program to check if the Given Number is Perfect Number or not.

package sanfoundary.Numbers;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		sc.close();

		int sum =0;
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		
		if(sum == number) {
			System.out.println("Perfect Number.");
		}else {
			System.out.println("Not a Perfect Number");
		}
	}
}
