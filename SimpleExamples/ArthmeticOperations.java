//Java Program to Perform Arithmetic Operations on two numbers

package sanfoundary.Simple;

import java.util.Scanner;

public class ArthmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		//Arithmetic Operations Addition, Substraction, Multipication, Division
		addition(a, b);
		substraction(a, b);
		multiply(a, b);
		divide(a, b);
	}
	
	public static void addition(int a, int b) {
		System.out.println(a+"+"+b+" = "+ (a+b));
	}
	
	public static void substraction(int a, int b) {
		System.out.println(a+"-"+b+" = " + (a-b));
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a+"*"+b+" = "+a*b);
		
	}
	
	public static void divide(int a, int b) {
		if(a == 0) {
			System.out.println("Invalid Operation");
		}else {
			System.out.println(a+"/"+b+" = "+a/b);
		}
		
	}
}
