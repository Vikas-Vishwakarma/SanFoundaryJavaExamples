//Java Program to Find the Largest Number Among Three Numbers

package sanfoundary.Simple;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int numberThree = sc.nextInt();
		sc.close();
		
		if(numberOne> numberTwo && numberOne > numberThree) 
			System.out.println(numberOne +" is greater than "+numberTwo+" and "+numberThree);
		else if(numberTwo > numberOne && numberTwo > numberThree) 
			System.out.println(numberTwo +" is greater than "+numberOne+" and "+numberThree);
		else if(numberThree > numberOne && numberThree > numberTwo) 
			System.out.println(numberThree +" is greater than "+numberOne+" and "+numberTwo);
		
	}
}
