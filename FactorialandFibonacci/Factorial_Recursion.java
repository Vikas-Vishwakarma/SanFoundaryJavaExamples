//Write a Java Program to Print Factorial of Given Number Uisng Recursion

package factorialandFibonacci;

import java.util.Scanner;

public class Factorial_Recursion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		findFactorial(n, 1, 1);
	}
	
	public static void findFactorial(int n, int mult, int start) {
		//Base Condition
		if(start == n) {
			System.out.println("Factorial of "+n+": "+mult);
			return;
		}
		
		//Logic
		start++;
		mult *= start;
		findFactorial(n, mult,start);
	}

}
