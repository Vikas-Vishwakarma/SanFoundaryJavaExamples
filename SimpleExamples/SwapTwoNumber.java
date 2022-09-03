//Java Program to Swap Two Numbers

package sanfoundary.Simple;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers to swap: ");
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		sc.close();
		System.out.print("A: "+numberOne+"  "+"B: "+numberTwo);

		//Swap Two Numbers Logic
		
		int temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;
		
		System.out.print("A: "+numberOne+"  "+"B: "+numberTwo);

	}

}
