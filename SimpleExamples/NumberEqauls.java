package sanfoundary.Simple;

import java.util.Scanner;

public class NumberEqauls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers to check number are equal or not: ");
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		sc.close();
		
		if(numberOne == numberTwo) {
			System.out.println(numberOne+" is equals "+numberTwo);
		}else {
			System.out.println(numberOne+" is not equals "+numberTwo);
		}
	}
}
