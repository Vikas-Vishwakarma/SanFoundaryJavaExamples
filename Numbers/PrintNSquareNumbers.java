package sanfoundary.Numbers;

import java.util.Scanner;

public class PrintNSquareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		printSquare(n);
		squareNumbers(n);
		cubeNumbers(n);
	}

	public static void printSquare(int n) {
		// Java Program to Print the First n Square Numbers
		for (int i = 1; i <= n; i++) {
			System.out.print(Math.pow(i, 2) + " ");
		}
		System.out.println();
	}

	public static void squareNumbers(int n) {
		// Java Program to Find the Sum of n Square Numbers
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		System.out.println();
		System.out.println("Sum of First "+n+" Square Number: " + sum);
	}

	public static void cubeNumbers(int n) {
		int sum = 0;
		// Java Program to Find the Sum of n Cube Numbers
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 3);
			// System.out.print(Math.pow(i, 3)+" ");
		}
		System.out.println();
		System.out.println("Sum of First "+n+" Cube Number: " + sum);
	}
}
