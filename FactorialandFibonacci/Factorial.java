//Write a Java Program to Print Factorial of Given Number. 
//What is Factorial ? 
//Example: 5! = 5x4x3x2x1 = 120

package factorialandFibonacci;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int mult = 1;
		for(int i=1 ; i <= n; i++) {
			mult *= i;
		}
		System.out.println("Factorial of "+n+": "+mult);
	}

}
