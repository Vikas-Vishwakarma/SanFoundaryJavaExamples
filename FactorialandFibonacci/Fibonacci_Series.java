//Write a java Program to prit Fibonacci Series till Given Number

package factorialandFibonacci;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.print("0 1 ");
		printFibonacci(n, 0, 1, 3);
	}

	public static void printFibonacci(int n, int val1, int val2, int count){

		//Base Condition
		if(count > n) {
			return;
		}

		//Logic
		int sum = val1 + val2;
		System.out.print(sum+" ");
		printFibonacci(n, val2, sum, count+1);
	}
}