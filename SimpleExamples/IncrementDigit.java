// Java Program to Increment by 1 All the Digits of a given Integer.

package sanfoundary.Simple;

import java.util.Scanner;

public class IncrementDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num;i++) {
			System.out.print(i+" ");
		}
	}
}
